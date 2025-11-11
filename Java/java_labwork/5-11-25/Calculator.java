class Calculator
{
	void Add(int i,int j)
	{
		System.out.println("Addition is:"+(i+j));
		System.out.println("Addition is:"+(i+j));
		System.out.println("Addition is:"+(i+j));
		System.out.println("Addition is:"+(i+j));
	}
	
	void Add(double i,double j)
	{
		System.out.println("Addition is:"+(i+j));
		System.out.println("Addition is:"+(i+j));
		System.out.println("Addition is:"+(i+j));
		System.out.println("Addition is:"+(i+j));
	}

	void Add(int i, double j)
	{
		System.out.println("Addition is:"+(i+j));
		System.out.println("Addition is:"+(i+j));
		System.out.println("Addition is:"+(i+j));
		System.out.println("Addition is:"+(i+j));
	}

	void Add(double j,int i)
	{
		System.out.println("Addition is:"+(i+j));
		System.out.println("Addition is:"+(i+j));
		System.out.println("Addition is:"+(i+j));
		System.out.println("Addition is:"+(i+j));
	} //p1 add ends here

	void Sub(int i,int j)
	{
		System.out.println("Subtraction is:"+(i-j));
		System.out.println("Subtraction is:"+(i-j));
		System.out.println("Subtraction is:"+(i-j));
		System.out.println("Subtraction is:"+(i-j));
	}

	void Sub(double i,double j)
	{
		System.out.println("Subtraction is:"+(i-j));
		System.out.println("Subtraction is:"+(i-j));
		System.out.println("Subtraction is:"+(i-j));
		System.out.println("Subtraction is:"+(i-j));
	}

	void Sub(int i,double j)
	{
		System.out.println("Subtraction is:"+(i-j));
		System.out.println("Subtraction is:"+(i-j));
		System.out.println("Subtraction is:"+(i-j));
		System.out.println("Subtraction is:"+(i-j));
	}
	
	void Sub(double i,int j)
	{
		System.out.println("Subtraction is:"+(i-j));
		System.out.println("Subtraction is:"+(i-j));
		System.out.println("Subtraction is:"+(i-j));
		System.out.println("Subtraction is:"+(i-j));
	} //p1 sub ends here

	void Mul(int i,int j)
	{
		System.out.println("Multiplication is:"+(i*j));
		System.out.println("Multiplication is:"+(i*j));
		System.out.println("Multiplication is:"+(i*j));
		System.out.println("Multiplication is:"+(i*j));
	}

	void Mul(double i,double j)
	{
		System.out.println("Multiplication is:"+(i*j));
		System.out.println("Multiplication is:"+(i*j));
		System.out.println("Multiplication is:"+(i*j));
		System.out.println("Multiplication is:"+(i*j));
	}

	void Mul(int i,double j)
	{
		System.out.println("Multiplication is:"+(i*j));
		System.out.println("Multiplication is:"+(i*j));
		System.out.println("Multiplication is:"+(i*j));
		System.out.println("Multiplication is:"+(i*j));
	}
	
	void Mul(double i,int j)
	{
		System.out.println("Multiplication is:"+(i*j));
		System.out.println("Multiplication is:"+(i*j));
		System.out.println("Multiplication is:"+(i*j));
		System.out.println("Multiplication is:"+(i*j));
	} //p1 multiplication ends here

	void Div(int i,int j)
	{
		System.out.println("Division is:"+(i/j));
		System.out.println("Division is:"+(i/j));
		System.out.println("Division is:"+(i/j));
		System.out.println("Division is:"+(i/j));
	}

	void Div(double i,double j)
	{
		System.out.println("Division is:"+(i/j));
		System.out.println("Division is:"+(i/j));
		System.out.println("Division is:"+(i/j));
		System.out.println("Division is:"+(i/j));
	}

	void Div(int i,double j)
	{
		System.out.println("Division is:"+(i/j));
		System.out.println("Division is:"+(i/j));
		System.out.println("Division is:"+(i/j));
		System.out.println("Division is:"+(i/j));
	}
	
	void Div(double i,int j)
	{
		System.out.println("Division is:"+(i/j));
		System.out.println("Division is:"+(i/j));
		System.out.println("Division is:"+(i/j));
		System.out.println("Division is:"+(i/j));
	}



		
}  //Calculator class ends here

class CalculatorTest
{
	public static void main(String[] abc)
	{

	Calculator p1 = new Calculator();

	p1.Add(1,2);
	p1.Add(5.7,8.34);
	p1.Add(25,56.78);
	p1.Add(89.04,63);

	p1.Sub(1,2);
	p1.Sub(5.7,8.34);
	p1.Sub(25,56.78);
	p1.Sub(89.04,63);

	p1.Mul(1,2);
	p1.Mul(5.7,8.34);
	p1.Mul(25,56.78);
	p1.Mul(89.04,63);

	p1.Div(1,2);
	p1.Div(5.7,8.34);
	p1.Div(25,56.78);
	p1.Div(89.04,63);
	} //main ends here
} //CalculatorTest ends here