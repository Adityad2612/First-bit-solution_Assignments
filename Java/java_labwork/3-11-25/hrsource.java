class HR {
    int id;
    String name;
    double salary,commission;

    void setId(int i) {
        this.id = i;
    }

    void setName(String n) {
        this.name = n;
    }

    void setSalary(double s) {
        this.salary = s;
    }

    void setCommission(double c) {
        this.commission = c;
    }

	int getId()
	{
		return this.id;
	}
	String getName()
	{
		return this.name;
	}
	double getSalary()
	{
		return this.salary;
	}
	double getCommission()
	{
		return this.commission;
	}

	void display()
	{
		System.out.println("Id is:"+this.id);
		System.out.println("name is:"+this.name);
		System.out.println("salary is:"+this.salary);
		System.out.println("commission is:"+this.commission);
	}
} // class HR ends here

class HRTest {
    public static void main(String[] args) {
        HR h1 = new HR();
	HR h2 = new HR();

        h1.setId(301);
        h1.setName("Aditya");
        h1.setSalary(60000);
        h1.setCommission(5000);

	h2.setId(302);
        h2.setName("Mohan");
        h2.setSalary(50000);
        h2.setCommission(7000);

	h1.getId();
        h1.getName();
        h1.getSalary();
        h1.getCommission();

	h2.getId();
        h2.getName();
        h2.getSalary();
        h2.getCommission();

	if(h1.getSalary() > h2.getSalary())
	{
		System.out.println("h1 has higher salary");
	}else
		System.out.println("h2 has highest salary");

	h1.display();
	h2.display();

        System.out.println("ID: " + h1.id + " | Name: " + h1.name +" | Salary: " + h1.salary +" | Commission: " + h1.commission);
    } // main ends here
} // class HRTest ends here
