class Student
{
	int rollno;
	String name;
	double percentage;

	Student(int r, String n, double p) 
	{
        this.rollno = r;
        this.name = n;
        this.percentage = p;
	}

} //class student ends here

class Employee
{
	int id;
	String name;
	double annualSalary;

	Employee(int i, String n, double as) 
	{
        this.id = i;
        this.name = n;
        this.annualSalary = as;
	}

} //class employee ends here

class Bank
{
	void ApproveLoan(Student s)
	{
        	System.out.println("Student Name: " + s.name);
        	System.out.println("Percentage: " + s.percentage);

		if(s.percentage > 80)
		{
			System.out.println("Loan approved: Rs2,00,000");
		}else if(s.percentage >= 60 && s.percentage <= 80) 
			{
            			System.out.println("Loan Approved: Rs1,00,000");
        		} else if (s.percentage >= 40 && s.percentage < 60) 
				{
            				System.out.println("Loan Approved: Rs50,000");
        			} else {
            					System.out.println("Loan Not Approved");
        				}
	}

	void ApproveLoan(Employee e) 
	{
        	System.out.println("Employee Name: " + e.name);
        	System.out.println("Annual Salary: Rs" + e.annualSalary + " LPA");

        	if (e.annualSalary > 12) 
		{
            		System.out.println("Loan Approved: Rs7,00,000");
        	} else if (e.annualSalary >= 10 && e.annualSalary <= 12) 
			{
            			System.out.println("Loan Approved: Rs6,00,000");
        		} else if (e.annualSalary >= 6 && e.annualSalary < 10) 
				{
           	 			System.out.println("Loan Approved: Rs5,00,000");
        			} else if (e.annualSalary >= 4 && e.annualSalary < 6) 
					{
            					System.out.println("Loan Approved: Rs4,00,000");
        				} else {
            						System.out.println("Loan Not Approved");
        					}
    }
		
	
} //class bank ends here

class Test3
{
	public static void main(String[] args)
	{
		Student s1 = new Student(101,"Aditya",87.6);
		Employee e1 = new Employee(201,"Ramesh",13);
		Bank b = new Bank();

		b.ApproveLoan(s1);
        	b.ApproveLoan(e1);

	} //main ends here
} //class Test3 ends here