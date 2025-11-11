package lab;

class Student 
{
	int fBId;
	String name;
	int distance;
	static int count = 0;
	
	Student() // default constructor
	{
		this.fBId = 4;
		this.name = "Mohan";
		this.distance = 5;
		count++;
	}
	
	Student(int fb,String n, int d) // parameterized constructor
	{
		this.fBId = fb;
		this.name = n;
		this.distance = d;
		count++;
	
	}
	
	
	public static int getCount() {
		return count;
	}

	public static void setCount(int count) {
		Student.count = count;
	}

	public int getfBId() {
		return fBId;
	}

	public void setfBId(int fBId) {
		this.fBId = fBId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getDistance() {
		return distance;
	}

	public void setDistance(int distance) {
		this.distance = distance;
	}
	
	void display()
	{
		System.out.println("Id is: "+this.fBId);
		System.out.println("name is: "+this.name);
		System.out.println("distance is: "+this.distance);
		System.out.println();
	}
	
} //class student ends here

class placedStudent extends Student //is-a relationship // step 1
{

	String cName;
	String designation;
	
	placedStudent() //default constructor
	{
		super(); //step 3a // must be first line
		this.cName = "L&T";
		this.designation = "Developer";
	}
	
	placedStudent(int fb,String n, int d,String cn,String des) // parameterized constructor
	{
		super(); //step 3 b // must be first line
		this.cName = cn;
		this.designation = des;
	
	} 
	  // step 2 remove setter and getter or state and behavior of super class

	public String getcName() {
		return cName;
	}



	public void setcName(String cName) {
		this.cName = cName;
	}



	public String getDesignation() {
		return designation;
	}



	public void setDesignation(String designation) {
		this.designation = designation;
	}
	
	void display()
	{
		super.display();
		System.out.println("company name is: "+this.cName);
		System.out.println("designation is: "+this.designation);
		System.out.println();
	}
		
}


class Test
{
		public static void main(String[] args)
		{
			/*Student s1 = new Student();
			Student s3 = new Student();
			Student s2 = new Student(2,"Samarth",2);*/
			
			
			placedStudent ps1 = new placedStudent();
			placedStudent ps3 = new placedStudent();
			placedStudent ps2 = new placedStudent(2,"Samarth",2,"Capgemini","Intern");
			System.out.println("Total count of student is:" +Student.getCount());
			
			/*s1.display();
			s2.display();*/
			
			ps1.display();
			ps2.display();
			
		} // main ends here
} //class test ends here
