import java.util.Scanner;

class Student {
    int rollNo;
    String name;
    double marks;

	Student()//default constructor
	{
		this.rollNo=21;
		this.name="Krish";
		this.marks=41;
	}
		
	Student(int rn, String n,double ma)
	{
		System.out.println();
		this.rollNo = rn;
		this.name = n;
		this.marks = ma;
	}

    void setRollNo(int r) {
        this.rollNo = r;
    }

    void setName(String n) {
        this.name = n;
    }

    void setMarks(double m) {
        this.marks = m;
    }

	int getRollNo()
	{
		return this.rollNo;
	}
	String getName()
	{
		return this.name;
	}
	double getMarks()
	{
		return this.marks;
	}

	void display()
	{
		System.out.println("Roll no is:"+this.rollNo);
		System.out.println("Name no is:"+this.name);
		System.out.println("Marks is:"+this.marks);
		System.out.println();
	}

} // class Student ends here

class StudentTest {
    public static void main(String[] args) {
        Student s1 = new Student();
	Student s2 = new Student();
	Student s3 = new Student();
	Student s4 = new Student(26,"Raman",63);
        s1.setRollNo(101);
        s1.setName("Rahul");
        s1.setMarks(88.5);

	s2.setRollNo(102);
        s2.setName("Aniket");
        s2.setMarks(72.17);

	s1.getRollNo();
        s1.getName();
        s1.getMarks();

	s2.getRollNo();
        s2.getName();
        s2.getMarks();
	
	if(s1.getMarks() > s2.getMarks())
	{
		System.out.println("s1 has more marks");
	}else
		System.out.println("s2 has more marks");

	s1.display();
	s2.display();
	s3.display();
	s4.display();

		System.out.println("Taking values from user");
		System.out.println("Enter Roll Number number:");

		Scanner sc = new Scanner(System.in);
		int roll = sc.nextInt();

		sc.nextLine();

		System.out.println("Enter name of student:");
		String name = sc.nextLine();
		
		System.out.println("Enter marks:");
		double marks = sc.nextDouble();

		Student s5 = new Student(roll,name,marks);
		s5.display();

        System.out.println("Roll No: " + s1.rollNo +" | Name: " + s1.name +" | Marks: " + s1.marks);
    } // main ends here
} // class StudentTest ends here
