class Product
{
int ProductId,Quantity;
String PName;
double Price;
	
	Product() //default constructor
	{
		System.out.println("Default constructor");
		this.ProductId=214;
		this.PName="Keyboard";
		this.Quantity=2;
		this.Price=607;
	}

	Product(int pi,String pn,int q,double p)
	{
		System.out.println("Parameterized constructor");
		this.ProductId=pi;
		this.PName=pn;
		this.Quantity=q;
		this.Price=p;
	}

void setProductID(int x)
	{
		this.ProductId=x;
	}

	void setPName(String str)
	{
		this.PName=str;
	}

	void setPrice(double y)
	{
		this.Price=y;
	}
	void setQuantity(int z)
	{
		this.Quantity=z;
	}

	int getProductId()
	{
		return this.ProductId;
	}
	int getQuantity()
	{
		return this.Quantity;
	}
	String getPName()
	{
		return this.PName;
	}
	double getPrice()
	{
		return this.Price;
	}

	void display()
	{
		System.out.println("Product is:"+this.ProductId);
		System.out.println("Product name is:"+this.PName);
		System.out.println("Product quantity is:"+this.Quantity);
		System.out.println("Product price is:"+this.Price);
	}

} //class product ends here

class ProductTest
{
public static void main(String[] abc)
	{
	Product p1,p2,p3,p4;
	p1 = new Product();
	p2 = new Product();
	p3 = new Product();
	p4 = new Product(107,"Mouse",2,500);

	p1.setProductID(101);
	p1.setPName("iPhone");
	p1.setPrice(45000);
	p1.setQuantity(1);
	
	p2.setProductID(102);
	p2.setPName("Lenovo");
	p2.setPrice(15000);
	p2.setQuantity(1);

	p1.getProductId();
	p1.getPName();
	p1.getPrice();
	p1.getQuantity();

	p2.getProductId();
	p2.getPName();
	p2.getPrice();
	p2.getQuantity();	

	if(p1.getPrice() > p2.getPrice())
	{
		System.out.println("p1 is more costlier");
	}else
		System.out.println("p2 is more costlier");

	p1.display();
	p2.display();
	p3.display();
	p4.display();

System.out.println("\nProduct id is:"+p1.ProductId+"product name:"+p1.PName+
"product price:"+p1.Price+"Qantity:"+p1.Quantity);
	} //main ends here
} //class ProductTest ends here
	