class Employee
{
	int ID;
	String name;
	double salary;
	void setID(int x)
	{
		this.ID=x;
	}

	void setName(String str)
	{
		this.name=str;
	}

	void setSalary(double y)
	{
		this.salary=y;
	}

	int getID()
	{
		return this.ID;
	}
	String getName()
	{
		return this.name;
	}
	double getSalary()
	{
		return this.salary;
	}

	void display()
	{
		System.out.println("ID is:"+this.ID);
		System.out.println("name is:"+this.name);
		System.out.println("salary is:"+this.salary);
	}

} // class Employee ends here

class EmployeeTest
{
	public static void main(String[] abc)
	{
		Employee e1,e2;
		e1 = new Employee();
		e2 = new Employee();

		e1.setID(101);
		e1.setName("Aditya");
		e1.setSalary(15000);

		e2.setID(102);
		e2.setName("Kishan");
		e2.setSalary(20000);

		e1.getID();
		e1.getName();
		e1.getSalary();

		e2.getID();
		e2.getName();
		e2.getSalary();
		
		if(e1.getSalary() > e2.getSalary()){
			System.out.println("d1 has more salary");
		}else
			System.out.println("d2 has more salary");

		e1.display();
		e2.display();
		System.out.println("Employee id is:"+e1.ID+"Employee name:"+e1.name+"Employee salary"+e1.salary);
	} //main ends here
} //EmployeeTest class ends here