package Assignment5;

import java.util.Scanner;

abstract class ElectricityBill
{
    int units;
    String customerName;

    ElectricityBill(String customerName, int units)
    {
        this.customerName = customerName;
        this.units = units;
    }
    
    

    public int getUnits() {
		return units;
	}



	public void setUnits(int units) {
		this.units = units;
	}



	public String getCustomerName() {
		return customerName;
	}



	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}



	void showUsage()
    {
        System.out.println("\nCustomer Name: " + customerName);
        System.out.println("Units Consumed: " + units);
    }

    abstract double calculateBill(); 

    final void generateBill()
    {
        showUsage();

        double base = calculateBill(); 

        double tax = base * 0.05;      
        double fixedCharge = 50;       

        double finalAmount = base + tax + fixedCharge;

        System.out.println();
        System.out.println("Base Amount : Rs. " + base);
        System.out.println("5% Tax      : Rs. " + tax);
        System.out.println("Fixed Charge: Rs. " + fixedCharge);
        System.out.println();
        System.out.println("FINAL BILL  : Rs. " + finalAmount);
        System.out.println();
    }
} //Electricity bill class ends here

class ResidentialBill extends ElectricityBill
{
    ResidentialBill(String name, int units)
    {
        super(name, units);
    }
    

    double calculateBill()
    {
        double amount = 0;

        if (units <= 100)
        {
             amount = units * 2.5;
        }
        else if (units >= 101 && units <= 300)
        {
             amount = units * 3.5;
        }
        else if(units >= 300 && units <= 500)
        {
             amount = units * 5;
        }

        else if (units > 500)
        {
              amount  = amount + 150; 
        }
		return amount;

    }
} //Residential bill class ends here

class CommercialBill extends ElectricityBill
{
    CommercialBill(String name, int units)
    {
        super(name, units);
    }

    double calculateBill()
    {
        double amount = units * 6.5;

        if (units < 200)
        {
            return 1500; 
        }

        if (units > 1000)
        {
            double surcharge = amount * 0.08; 
            amount = amount + surcharge;
        }
		return amount;

    }
} // commercial bill class ends here

class ElectricityBillTest
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("--- ELECTRICITY BILL CALCULATOR ---");
        System.out.println("1. Residential Customer");
        System.out.println("2. Commercial Customer");
        System.out.print("Enter your choice: ");
        int ch = sc.nextInt();
        sc.nextLine(); 

        System.out.print("Enter Customer Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Units Consumed: ");
        int units = sc.nextInt();

        ElectricityBill eb;

        if (ch == 1)
        {
            eb = new ResidentialBill(name, units);
        }
        else if (ch == 2)
        {
            eb = new CommercialBill(name, units);
        }
        else
        {
            System.out.println("Invalid choice!");
            sc.close();
            return;
        }
        

        eb.generateBill(); 

        sc.close();
    } // main ends here
} // ElectricityTest class ends here

