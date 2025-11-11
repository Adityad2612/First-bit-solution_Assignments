class LibraryUser
{
	String name;
	int daysLate;
	static double finePerDay;

	static
	{
		finePerDay=10;
	}

	LibraryUser(String n,int dl)
	{
		this.name = n;
		this.daysLate = dl;
	}

	void setName(String n)
	{
		this.name = n;
	}

	void setDaysLate(int d)
	{
		this.daysLate = d;
	}

	static void setFinePerDay(double fine)
	{
		finePerDay = fine;
	}
	
	
	String getName()
	{
		return this.name;
	}

	int getDaysLate(){
		return this.daysLate;
	}

	double getFinePerDay(){
		return finePerDay;
	}

	void calculateFine()
	{
		double totalFine = daysLate * finePerDay;
		System.out.println("User Name: " + name);
		System.out.println("Days Late: " + daysLate);
		System.out.println("Fine Per Day: Rs" + finePerDay);
		System.out.println("Total Fine: Rs" + totalFine);
		System.out.println();
	}
	

} //class LibraryUser ends here

class Test3
{
	public static void main(String[] args)
	{
		LibraryUser lu1 = new LibraryUser("Rahul", 5);
		LibraryUser lu2 = new LibraryUser("Sneha", 3);

		lu1.calculateFine();
		lu2.calculateFine();

		LibraryUser.setFinePerDay(50);
		System.out.println("After changing fine per day:\n");

		lu1.calculateFine();
		lu2.calculateFine();

		
	} //main ends here
} // class test3 ends here