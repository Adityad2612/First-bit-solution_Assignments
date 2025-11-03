class Book
{
	int ISBN;
	String bname,category;
	double price;

	void SetISBN(int x)
	{
		this.ISBN=x;
	}
	void SetBName(String str)
	{
		this.bname=str;
	}
	void SetCategory(String str1)
	{
		this.category=str1;
	}
	void SetPrice(double y)
	{
			this.price=y;
	}
} //class book ends here

class BookTest
{
public static void main(String[] abc)
	{
		Book b1;
		b1 = new Book();
		b1.SetISBN(105);
		b1.SetBName("C Programming");
		b1.SetCategory("Programming");
		b1.SetPrice(250);

		System.out.println("ISBN no is:"+b1.ISBN+"Name:"+b1.bname+
"Category:"+b1.category+"Price"+b1.price);
	} //main ends here
} //class bookTest ends here