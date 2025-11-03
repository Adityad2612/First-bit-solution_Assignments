class Employee
{
	int ID;
	String name;
	double salary;
	void SetID(int x)
	{
		this.ID=x;
	}

	void SetName(String str)
	{
		this.name=str;
	}

	void SetSalary(double y)
	{
		this.salary=y;
	}

} // class Employee ends here

class EmployeeTest
{
	public static void main(String[] abc)
	{
		Employee e1;
		e1 = new Employee();
		e1.SetID(101);
		e1.SetName("Aditya");
		e1.SetSalary(25000);
		
		System.out.println("Employee id is:"+e1.ID+"Employee name:"+e1.name+"Employee salary"+e1.salary);
	} //main ends here
} //EmployeeTest class ends here