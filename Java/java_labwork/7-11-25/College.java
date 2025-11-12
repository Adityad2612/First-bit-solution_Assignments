package lab;

class College {

	int collegeId;
	String collegeName;
	String city;
	String state;
	int noOfDepartments;
	int noOfStudents;
	int noOfTeachers;

	College() // default constructor
	{
		this.collegeId = 101;
		this.collegeName = "Sunrise College";
		this.city = "Pune";
		this.state = "Maharashtra";
		this.noOfDepartments = 5;
		this.noOfStudents = 2000;
		this.noOfTeachers = 120;
	}

	College(int collegeId, String collegeName, String city, String state, int noOfDepartments, int noOfStudents,
			int noOfTeachers) // parameterized constructor
	{
		this.collegeId = collegeId;
		this.collegeName = collegeName;
		this.city = city;
		this.state = state;
		this.noOfDepartments = noOfDepartments;
		this.noOfStudents = noOfStudents;
		this.noOfTeachers = noOfTeachers;
	}

	public int getCollegeId() {
		return collegeId;
	}

	public void setCollegeId(int collegeId) {
		this.collegeId = collegeId;
	}

	public String getCollegeName() {
		return collegeName;
	}

	public void setCollegeName(String collegeName) {
		this.collegeName = collegeName;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public int getNoOfDepartments() {
		return noOfDepartments;
	}

	public void setNoOfDepartments(int noOfDepartments) {
		this.noOfDepartments = noOfDepartments;
	}

	public int getNoOfStudents() {
		return noOfStudents;
	}

	public void setNoOfStudents(int noOfStudents) {
		this.noOfStudents = noOfStudents;
	}

	public int getNoOfTeachers() {
		return noOfTeachers;
	}

	public void setNoOfTeachers(int noOfTeachers) {
		this.noOfTeachers = noOfTeachers;
	}

	void display() {
		System.out.println("College ID: " + this.collegeId);
		System.out.println("College Name: " + this.collegeName);
		System.out.println("City: " + this.city);
		System.out.println("State: " + this.state);
		System.out.println("Number of Departments: " + this.noOfDepartments);
		System.out.println("Number of Students: " + this.noOfStudents);
		System.out.println("Number of Teachers: " + this.noOfTeachers);
	}
} // College class ends here

class EngineeringCollege extends College {

	int labs;
	int projects;
	int patents;

	EngineeringCollege() // default constructor
	{
		super();
		this.labs = 20;
		this.projects = 100;
		this.patents = 15;
	}

	EngineeringCollege(int collegeId, String collegeName, String city, String state, int noOfDepartments,
			int noOfStudents, int noOfTeachers, int labs, int projects, int patents) // parameterized constructor
	{
		super(collegeId, collegeName, city, state, noOfDepartments, noOfStudents, noOfTeachers);
		this.labs = labs;
		this.projects = projects;
		this.patents = patents;
	}

	void display() {
		super.display();
		System.out.println("Number of Labs: " + this.labs);
		System.out.println("Number of Projects: " + this.projects);
		System.out.println("Number of Patents: " + this.patents);
		System.out.println();
	}
} // EngineeringCollege class ends here

class MedicalCollege extends College {

	int hospitals;
	int doctors;
	int researchLabs;

	MedicalCollege() // default constructor
	{
		super();
		this.hospitals = 2;
		this.doctors = 80;
		this.researchLabs = 5;
	}

	MedicalCollege(int collegeId, String collegeName, String city, String state, int noOfDepartments,
			int noOfStudents, int noOfTeachers, int hospitals, int doctors, int researchLabs) // parameterized constructor
	{
		super(collegeId, collegeName, city, state, noOfDepartments, noOfStudents, noOfTeachers);
		this.hospitals = hospitals;
		this.doctors = doctors;
		this.researchLabs = researchLabs;
	}

	void display() {
		super.display();
		System.out.println("Number of Hospitals: " + this.hospitals);
		System.out.println("Number of Doctors: " + this.doctors);
		System.out.println("Number of Research Labs: " + this.researchLabs);
		System.out.println();
	}
} // MedicalCollege class ends here

class LawCollege extends College {

	int courtsVisited;
	int legalEvents;
	int caseStudies;

	LawCollege() // default constructor
	{
		super();
		this.courtsVisited = 12;
		this.legalEvents = 8;
		this.caseStudies = 25;
	}

	LawCollege(int collegeId, String collegeName, String city, String state, int noOfDepartments,
			int noOfStudents, int noOfTeachers, int courtsVisited, int legalEvents, int caseStudies) // parameterized constructor
	{
		super(collegeId, collegeName, city, state, noOfDepartments, noOfStudents, noOfTeachers);
		this.courtsVisited = courtsVisited;
		this.legalEvents = legalEvents;
		this.caseStudies = caseStudies;
	}

	void display() {
		super.display();
		System.out.println("Number of Courts Visited: " + this.courtsVisited);
		System.out.println("Number of Legal Events: " + this.legalEvents);
		System.out.println("Number of Case Studies: " + this.caseStudies);
		System.out.println();
	}
} // LawCollege class ends here

class CollegeTest {

	public static void main(String[] args) {

		System.out.println("--- College ---");
		College c1 = new College();
		College c2 = new College(102, "Green Valley College", "Nashik", "Maharashtra", 8, 3500, 200);

		c1.display();
		System.out.println();
		c2.display();
		System.out.println();

		System.out.println("--- Engineering college ---");
		EngineeringCollege e1 = new EngineeringCollege();
		EngineeringCollege e2 = new EngineeringCollege(103, "Techno Engineering College", "Mumbai", "Maharashtra", 10,
				4000, 250, 25, 150, 20);

		e1.display();
		e2.display();

		System.out.println("--- Medical College ---");
		MedicalCollege m1 = new MedicalCollege();
		MedicalCollege m2 = new MedicalCollege(104, "LifeLine Medical College", "Nagpur", "Maharashtra", 7, 2200, 180,
				3, 100, 7);

		m1.display();
		m2.display();

		System.out.println("--- Law College ---");
		LawCollege l1 = new LawCollege();
		LawCollege l2 = new LawCollege(105, "Justice Law College", "Kolhapur", "Maharashtra", 4, 1500, 90, 15, 12, 40);

		l1.display();
		l2.display();
	} // main ends here
} // CollegeTest class ends here
