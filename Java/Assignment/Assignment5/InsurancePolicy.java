package Assignment5;

import java.util.Scanner;

abstract class InsurancePolicy
{
    String policyHolderName;
    double basePremium;

    InsurancePolicy(String policyHolderName, double basePremium)
    {
        this.policyHolderName = policyHolderName;
        this.basePremium = basePremium;
    }

    
    
    public String getPolicyHolderName() {
		return policyHolderName;
	}



	public void setPolicyHolderName(String policyHolderName) {
		this.policyHolderName = policyHolderName;
	}



	public double getBasePremium() {
		return basePremium;
	}



	public void setBasePremium(double basePremium) {
		this.basePremium = basePremium;
	}



	abstract double calculatePremium();   

    void printPolicyDetails()
    {
        double finalPremium = calculatePremium();

        System.out.println("\n--- INSURANCE POLICY DETAILS ---");
        System.out.println("Policy Holder Name : " + this.policyHolderName);
        System.out.println("Base Premium       : Rs. " + this.basePremium);
        System.out.println("Final Premium      : Rs. " + finalPremium);
        System.out.println();
    }
} // InsurancePoicy class ends here


class CarInsurance extends InsurancePolicy
{
    int carAgeInYears;
    boolean hadAccidentInLastYear;
    double carValue;

    CarInsurance(String name, double basePremium, int carAge, boolean accident, double carValue)
    {
        super(name, basePremium);
        this.carAgeInYears = carAge;
        this.hadAccidentInLastYear = accident;
        this.carValue = carValue;
    }

    
    
    public int getCarAgeInYears() {
		return carAgeInYears;
	}



	public void setCarAgeInYears(int carAgeInYears) {
		this.carAgeInYears = carAgeInYears;
	}



	public boolean isHadAccidentInLastYear() {
		return hadAccidentInLastYear;
	}



	public void setHadAccidentInLastYear(boolean hadAccidentInLastYear) {
		this.hadAccidentInLastYear = hadAccidentInLastYear;
	}



	public double getCarValue() {
		return carValue;
	}



	public void setCarValue(double carValue) {
		this.carValue = carValue;
	}



	double calculatePremium()
    {
        double premium = basePremium;

        if (carAgeInYears <= 3)
            premium = premium + basePremium * 0.10;
        else if (carAgeInYears <= 7)
        	premium = premium + basePremium * 0.20;
        else
        	premium = premium + basePremium * 0.30;

        if (hadAccidentInLastYear)
        	premium = premium + basePremium * 0.25;
        else
        	premium = premium + basePremium * 0.10;   

        if (carValue > 1000000)   
            premium = premium + 2000;

        return premium;
    }
}// car insurance class  ends here

class HealthInsurance extends InsurancePolicy
{
    int age;
    boolean isSmoker;
    boolean hasPreExistingDisease;

    HealthInsurance(String name, double basePremium, int age, boolean smoker, boolean disease)
    {
        super(name, basePremium);
        this.age = age;
        this.isSmoker = smoker;
        this.hasPreExistingDisease = disease;
    }
    
    

    public int getAge() {
		return age;
	}



	public void setAge(int age) {
		this.age = age;
	}



	public boolean isSmoker() {
		return isSmoker;
	}



	public void setSmoker(boolean isSmoker) {
		this.isSmoker = isSmoker;
	}



	public boolean isHasPreExistingDisease() {
		return hasPreExistingDisease;
	}



	public void setHasPreExistingDisease(boolean hasPreExistingDisease) {
		this.hasPreExistingDisease = hasPreExistingDisease;
	}



	double calculatePremium()
    {
        double premium = basePremium;

        if (age < 30)
        	premium = premium + basePremium * 0.10;
        else if (age <= 45)
        	premium = premium + basePremium * 0.25;
        else
        	premium = premium + basePremium * 0.40;

        if (isSmoker)
        	premium = premium + basePremium * 0.30;
        else
        	premium = premium + basePremium * 0.05;

        if (hasPreExistingDisease)
        	premium = premium + basePremium * 0.20;

        return premium;
    }
}// health insurance class ends here

class InsuranceTest
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("--- INSURANCE PREMIUM CALCULATOR ---");
        System.out.println("1. Car Insurance");
        System.out.println("2. Health Insurance");
        System.out.print("Enter your choice: ");
        int choice = sc.nextInt();
        sc.nextLine(); 

        System.out.print("Enter Policy Holder Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Base Premium: ");
        double base = sc.nextDouble();

        InsurancePolicy policy = null;

        if (choice == 1)
        {
            System.out.print("Enter Car Age (years): ");
            int carAge = sc.nextInt();

            System.out.print("Had Accident in Last Year? (true/false): ");
            boolean accident = sc.nextBoolean();

            System.out.print("Enter Car Value (Rs): ");
            double value = sc.nextDouble();

            policy = new CarInsurance(name, base, carAge, accident, value);
        }
        else if (choice == 2)
        {
            System.out.print("Enter Age: ");
            int age = sc.nextInt();

            System.out.print("Is Smoker? (true/false): ");
            boolean smoker = sc.nextBoolean();

            System.out.print("Has Pre-Existing Disease? (true/false): ");
            boolean disease = sc.nextBoolean();

            policy = new HealthInsurance(name, base, age, smoker, disease);
        }

        policy.printPolicyDetails();
        sc.close();
    }
}
