package lab;

class Employee 
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
	
	void display()
	{
		System.out.println("Id is: "+this.eId);
		System.out.println("Name is: "+this.name);
		System.out.println("Salary is: "+this.salary);
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
	
	void display()
	{
		super.display();
		System.out.println("Allowances is: "+this.allowances);
		System.out.println();
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
	
	void display()
	{
		super.display();
		System.out.println("Commission is: "+this.commision);
		System.out.println();
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
	
	void display()
	{
		super.display();
		System.out.println("Incentive is:"+this.incentive);
		System.out.println("Target is: "+this.target);
		System.out.println();
	}
	
} // class salesManager ends here

class EmployeeTest
{
	public static void main(String[] args)
	{
		Employee e1 = new Employee();
		Employee e2 = new Employee(102,"Ram",30000);
		
		e1.display();
		e2.display();
		
		Admin a1 = new Admin();
		Admin a2 = new Admin(103,"Karna",30000,6000);
		
		a1.display();
		a2.display();
		
		HR h1 = new HR();
		HR h2 = new HR(104,"Neha",30000,15000);
		
		h1.display();
		h2.display();
		
		salesManager sm1 = new salesManager();
		salesManager sm2 = new salesManager(105,"Laxman",30000,3000,500000);
		
		sm1.display();
		sm2.display();
		
	} //main ends here
} // class employeeTest ends here
