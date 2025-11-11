class SalesManager {
    int id;
    String name;
    double salary,incentive,target;

    void setId(int i) {
        this.id = i;
    }

    void setName(String n) {
        this.name = n;
    }

    void setSalary(double s) {
        this.salary = s;
    }

    void setIncentive(double inc) {
        this.incentive = inc;
    }

    void setTarget(double t) {
        this.target = t;
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
	double getIncentive()
	{
		return this.incentive;
	}
	double getTarget()
	{
		return this.target;
	}

	void display()
	{
		System.out.println("Id is:"+this.id);
		System.out.println("name is:"+this.name);
		System.out.println("salary is:"+this.salary);
		System.out.println("incentive is:"+this.incentive);
		System.out.println("target is:"+this.target);
	}

} // class SalesManager ends here

class SalesManagerTest {
    public static void main(String[] args) {
        SalesManager sm1 = new SalesManager();
	SalesManager sm2 = new SalesManager();

        sm1.setId(401);
        sm1.setName("Amit");
        sm1.setSalary(70000);
        sm1.setIncentive(10000);
        sm1.setTarget(500000);

	sm2.setId(402);
        sm2.setName("Raj");
        sm2.setSalary(90000);
        sm2.setIncentive(10000);
        sm2.setTarget(500000);

	sm1.getId();
        sm1.getName();
        sm1.getSalary();
        sm1.getIncentive();
        sm1.getTarget();
	
	sm2.getId();
        sm2.getName();
        sm2.getSalary();
        sm2.getIncentive();
        sm2.getTarget();

	if(sm1.getIncentive() > sm2.getIncentive())
	{
		System.out.println("sm1 has more incentive");
	}else
		System.out.println("sm2 has more incentive");

	sm1.display();
	sm2.display();

        System.out.println("ID: " + sm1.id +" | Name: " + sm1.name +" | Salary: "+ sm1.salary + " | Incentive: " + sm1.incentive +" | Target: " + sm1.target);
    } // main ends here
} // class SalesManagerTest ends here
