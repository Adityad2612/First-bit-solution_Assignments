package lab;

 abstract class Employee 
{

	int eId;
	String name;
	double salary;
	
	Employee() //default constructor
	{
		this.eId = 101;
		this.name = "Pritam";
		this.salary = 25000;
	}
	
	Employee(int id,String n,double sal) // parameterized constructor
	{
		this.eId = id;
		this.name = n;
		this.salary = sal;
	}
	
	public int geteId() {
		return eId;
	}
	public void seteId(int eId) {
		this.eId = eId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	 abstract double calSal();
	
	 public String toString()
		{
			return "Id is: " +this.eId + "Name is: "+this.name + "Salary is: "+this.salary +
					"Final Salary is: "+this.calSal();
		} 


} // class employee ends here

class Admin extends Employee
{
	
	double allowances;
	
	Admin() //default constructor
	{
		super();
		this.allowances = 7500;
	}
	
	Admin(int id,String n,double sal,double allow) // parameterized constructor
	{
		super(id,n,sal);
		this.allowances = allow;
	}

	public double getAllowances() {
		return allowances;
	}

	public void setAllowances(double allowances) {
		this.allowances = allowances;
	}
	double calSal()
	{
		return salary + allowances;
	}
	
	public String toString()
	{
		return super.toString()+ "\nAllowances is: " +this.allowances + "\nFinal Salary is: " +this.calSal();
	}
	
	
} //class admin ends here

class HR extends Employee
{
	double commision;
	
	HR() //default constructor
	{
		super();
		this.commision = 5000;
	}

	HR(int id,String n,double sal,double comm)
	{
		super();
		this.commision = comm;
	}
	
	public double getCommision() {
		return commision;
	}

	public void setCommision(double commision) {
		this.commision = commision;
	}
	
	double calSal()
	{
		return salary + commision;
	}
	
	public String toString()
	{
		return super.toString()+"\nCommission is: " +this.commision + "\nFinal Salary is: "+this.calSal();
	}
	
	
} // class hr ends here

class salesManager extends Employee
{
	double incentive;
	double target;
	
	salesManager() //default constructor
	{
		super();
		double incentive = 10000;
		double target = 100000;
	}
	
	salesManager(int id,String n,double sal,double inc,double tar) //parameterized constructor
	{
		super(id,n,sal);
		this.incentive = inc;
		this.target = tar;
	}
	
	public double getIncentive() {
		return incentive;
	}
	public void setIncentive(double incentive) {
		this.incentive = incentive;
	}
	public double getTarget() {
		return target;
	}
	public void setTarget(double target) {
		this.target = target;
	}
	
	double calSal()
	{
		return salary + incentive;
	}
	
	public String toString()
	{
		return super.toString()+"\n Incentive is: "+ this.incentive + 
				"\nTarget is: " +this.target + "\nFinal Salary is: "+this.calSal();
	}
	
	
} // class salesManager ends here

class AreaManager extends salesManager
{
	String AreaName;
	
	AreaManager() //default parameterized
	{
		this.AreaName = "Pune";
	}
	
	AreaManager(int id,String n,double sal,double inc,double tar,String an) //parameterized constructor
	{
		super(id,n,sal,inc,tar);
		this.AreaName = an;
	}

	public String getAreaName() {
		return AreaName;
	}

	public void setAreaName(String areaName) {
		AreaName = areaName;
	}
	
	public String toString()
	{
		return super.toString()+"\nArea name is: " +this.AreaName;
	}
	
	
} //class AreaManager ends here

class EmployeeTest
{
	public static void main(String[] args)
	{
		Employee e1;

		System.out.println("--- Admin ---");
		 e1 = new Admin(102,"Mohan",30000,30000);
		 System.out.println(e1.toString());
		 
		 System.out.println("--- sales manager ---");
		 e1 = new salesManager(105,"Laxman",30000,3000,500000);
		 System.out.println(e1.toString());
		 
		 System.out.println("--- HR ---");
		 e1 = new HR(104,"Neha",30000,15000);
		 System.out.println(e1.toString());
		 
		 System.out.println("--- Area Manager ---");
		 e1 = new AreaManager(105,"Subu",30000,3000,500000,"Mumbai");
		 System.out.println(e1.toString());
			
	} //main ends here
} // class employeeTest ends here
