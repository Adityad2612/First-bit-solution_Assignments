class Admin {
    int id;
    double salary,allowances;
    String name;

    void setId(int i) {
        this.id = i;
    }

    void setSalary(double s) {
        this.salary = s;
    }

    void setName(String n) {
        this.name = n;
    }

    void setAllowances(double a) {
        this.allowances = a;
    }
	int getId()
	{
		return this.id;
	}
	double getSalary()
	{
		return this.salary;
	}
	double getAllowances()
	{
		return this.allowances;
	}
	String getName()
	{
		return this.name;
	}

	void display()
	{
		System.out.println("Id is " +this.id);
		System.out.println("name is " +this.name);
		System.out.println("salary is " +this.salary);
		System.out.println("allowances is " +this.allowances);
	}
} // class Admin ends here

class AdminTest {
    public static void main(String[] args) {
        Admin a1 = new Admin();
	Admin a2 = new Admin();

        a1.setId(201);
        a1.setSalary(55000);
        a1.setName("Ravi");
        a1.setAllowances(8000);

	a2.setId(202);
        a2.setSalary(50000);
        a2.setName("Aditya");
        a2.setAllowances(8050);

	a1.getId();
        a1.getSalary();
        a1.getName();
        a1.getAllowances();

	a2.getId();
        a2.getSalary();
        a2.getName();
        a2.getAllowances();

	if(a1.getSalary() > a2.getSalary()){
		System.out.println("al has more salary");
	}
	else
		System.out.println("a2 has more salary");
	
	a1.display();
	a2.display();

        System.out.println("ID: " + a1.id +" | Name: " + a1.name +" | Salary: " + a1.salary + "| Allowances: " + a1.allowances);
    } // main ends here
} // class AdminTest ends here
