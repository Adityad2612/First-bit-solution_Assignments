import java.util.Scanner;

class Complex {
    int real,imaginary;

	Complex() //default constructor
	{
		this.real = 5;
		this.imaginary = 9;
	} // constructor ends here

	Complex(int r,int i)
	{
		System.out.println();
		this.real=r;
		this.imaginary=i;
	}

    void setReal(int r) {
        this.real = r;
    }

    void setImaginary(int i) {
        this.imaginary = i;
    }

	int getReal()
	{
		return this.real;
	}
	int getImaginary()
	{
		return this.imaginary;
	}

	void display(){
		System.out.println(+this.real+"+"+this.imaginary+"i");
		System.out.println();
	}
} // class Complex ends here

class ComplexTest {
    public static void main(String[] args) {
        Complex c1 = new Complex();
	Complex c2 = new Complex();
	Complex c3 = new Complex();
	Complex c4 = new Complex(9,9);
	Scanner sc = new Scanner(System.in);

        c1.setReal(5);
        c1.setImaginary(3);

	c2.setReal(7);
        c2.setImaginary(3);

	c1.getReal();
        c1.getImaginary();

	c2.getReal();
        c2.getImaginary();

	if(c1.getReal() > c2.getReal()){
		System.out.println("C1 is greater");
	}else
		System.out.println("C2 is greater");

	c1.display();
	c2.display();
	c3.display();
	c4.display();

	System.out.println("Taking values from user");
	System.out.println("Enter real number:");
	int real = sc.nextInt();

	System.out.println("Enter complex number:");
	int complex = sc.nextInt();

	Complex c5 = new Complex(real,complex);
	c5.display();


        System.out.println(c1.real +"+" + c1.imaginary+"i");
    } // main ends here
} // class ComplexTest ends here
