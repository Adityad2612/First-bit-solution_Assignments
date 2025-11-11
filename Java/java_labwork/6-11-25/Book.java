import java.util.Scanner;

class Book
{
	int ISBN;
	String bname,category;
	double price;

	Book()
	{
		this.ISBN = 125;
		this.bname = "Harry potter";
		this.category = "Fictional";
		this.price = 500;
	} //constructor end

	Book(int i,String bn,String c,double p)
	{
		System.out.println();
		this.ISBN=i;
		this.bname=bn;
		this.category=c;
		this.price=p;
	}

	void setISBN(int x)
	{
		this.ISBN=x;
	}
	void setBName(String str)
	{
		this.bname=str;
	}
	void setCategory(String str1)
	{
		this.category=str1;
	}
	void setPrice(double y)
	{
		this.price=y;
	}
	
	int getISBN()
	{
		return this.ISBN;
	}
	String getBName()
	{
		return this.bname;
	}
	String getCategory()
	{
		return this.category;
	}
	double getPrice()
	{
		return this.price;
	}

	void display(){
		System.out.println("Book id is:"+this.ISBN);
		System.out.println("Book name is:"+this.bname);
		System.out.println("Book category is:"+this.category);
		System.out.println("Book price is:"+this.price);
		System.out.println();
		}
} //class book ends here

class BookTest
{
public static void main(String[] abc)
	{
		Book b1,b2,b3,b4;
		b1 = new Book();
		b2 = new Book();
		b3 = new Book();
		b4 = new Book(235,"Haapy","biography",250);
		Scanner sc = new Scanner(System.in);

		b1.setISBN(105);
		b1.setBName("C Programming");
		b1.setCategory("Programming");
		b1.setPrice(250);
	
		b2.setISBN(107);
		b2.setBName("java Programming");
		b2.setCategory("Programming");
		b2.setPrice(300);

		b1.getISBN();
		b1.getBName();
		b1.getCategory();
		b1.getPrice();

		b2.getISBN();
		b2.getBName();
		b2.getCategory();
		b2.getPrice();

		if(b1.getPrice() >b2.getPrice())
		{
			System.out.println("b1 has more salary");
		}else
			System.out.println("b2 has more salary");

		b1.display();
		b2.display();
		b3.display();
		b4.display();
		
		System.out.println("Taking values from user");
	
		System.out.println("Enter ISBN number:");
		int isbn = sc.nextInt();

		sc.nextLine();

		System.out.println("Enter Book name:");
		String bname = sc.nextLine();

		System.out.println("Enter Book Category:");
		String category = sc.nextLine();
		
		System.out.println("Enter price:");
		double price = sc.nextDouble();

		Book b5 = new Book(isbn,bname,category,price);
		b5.display();
		
		System.out.println("ISBN no is:"+b1.ISBN+"Name:"+b1.bname+"Category:"+b1.category+"Price"+b1.price);
	} //main ends here
} //class bookTest ends here