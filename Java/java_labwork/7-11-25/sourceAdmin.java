import java.util.Scanner;

class Admin {
    int id;
    double salary,allowances;
    String name;

	Admin() //default constructor
	{
		this.id=501;
		this.salary=56800;
		this.allowances=6572;
		this.name="Yash";
	} //constructor called 

	Admin(int i,String n,double s,double a) 
	{
		System.out.println();
		this.id=i;
		this.name=n;
		this.salary=s;
		this.allowances=a;
	}
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
		System.out.println();
	}
} // class Admin ends here

class AdminTest {
    public static void main(String[] args) {
        Admin a1 = new Admin();
	Admin a2 = new Admin();
	Admin a3 = new Admin();
	Admin a4 = new Admin(523,"Kartik",70000,10000);
	Scanner sc = new Scanner(System.in);

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
	a3.display();
	a4.display();


		System.out.println("Taking values from user");

		System.out.println("Enter Id:");
		int id = sc.nextInt();

		sc.nextLine();

		System.out.println("Enter name:");
		String name = sc.nextLine();
		
		System.out.println("Enter salary:");
		double salary = sc.nextDouble();

		System.out.println("Enter allowances:");
		double allow = sc.nextDouble();

		Admin a5 = new Admin(id,name,salary,allow);
		a5.display();

		Admin[] arr = new Admin[3];

		arr[0] = new Admin();
		arr[1] = new Admin(165,"Raman",15000,10000);
		arr[2] = new Admin(160,"Daya",50000,10000);

		for(int i=0;i<arr.length;i++)
		{
			System.out.println(arr[i]);
		}

        System.out.println("ID: " + a1.id +" | Name: " + a1.name +" | Salary: " + a1.salary + "| Allowances: " + a1.allowances);
    } // main ends here
} // class AdminTest ends here

