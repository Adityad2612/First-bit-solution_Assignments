class Printer
{

	void print(char c)
	{
		System.out.println("character is:"+c);
	}
	void print(int i)
	{
		System.out.println("integer is:"+i);
	}
	void print(String s)
	{
		System.out.println("character is:"+s);
	}
	void print()
	{
		System.out.println("Empty:");
	}
	
} //Printer class ends here

class Test
{
	public static void main(String[] args)
	{
		Printer p1 = new Printer();
		p1.print();
		p1.print(10);
		p1.print('a');
		p1.print("Wednesday");
	} //main ends here
} // test class ends here