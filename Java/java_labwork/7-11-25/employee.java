class Employee
{
	String name;
	double basicSalary;
	static double companyBonusRate;

	static
	{
		companyBonusRate = 10;
	}

	Employee(String n,double bs)
	{
		this.name = n;
		this.basicSalary = bs;
	}

	void setName(String n){
		this.name = n;
	}

	void setBasicSalary(double bs){
		this.basicSalary = bs;
	}

	static void setCompanyBonusRate(double rate){
		companyBonusRate = rate;
	}

	String getName(){
		return this.name;
	}

	double getBasicSalary(){
		return this.basicSalary;
	}

	double getCompanyBonusRate(){
		return companyBonusRate;
	}

	void calculateTotalSalary()
	{
		double totalSalary = basicSalary + (basicSalary * companyBonusRate / 100);
		System.out.println("Employee Name: " + name);
		System.out.println("Basic Salary: Rs" + basicSalary);
		System.out.println("Company Bonus Rate: " + companyBonusRate + "%");
		System.out.println("Total Salary: Rs" + totalSalary);
		System.out.println();
	}

} //class Employee ends here

class Test1
{
	public static void main(String[] args)
	{
		Employee e1 = new Employee("Aditya",50000);
		Employee e2 = new Employee("Sanket",60000);

		e1.setCompanyBonusRate(12.5);

		e1.calculateTotalSalary();
		e2.calculateTotalSalary();

		Employee.setCompanyBonusRate(15.0);
		System.out.println("After changing company bonus rate:\n");

		e1.calculateTotalSalary();
		e2.calculateTotalSalary();


	} //main ends here
} //class Test1 ends here