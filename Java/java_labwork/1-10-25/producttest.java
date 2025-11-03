class product
{
int ProductId,Quantity;
String PName;
double Price;

void SetProductID(int x)
	{
		this.ProductId=x;
	}

	void SetPName(String str)
	{
		this.PName=str;
	}

	void SetPrice(double y)
	{
		this.Price=y;
	}
	void SetQuantity(int z)
	{
		this.Quantity=z;
	}

} //class prodct ends here

class productTest
{
public static void main(String[] abc)
	{
	product p1;
	p1 = new product();
	p1.SetProductID(101);
	p1.SetPName("iPhone");
	p1.SetPrice(45000);
	p1.SetQuantity(1);
System.out.println("Product id is:"+p1.ProductId+"product name:"+p1.PName+
"product price:"+p1.Price+"Qantity:"+p1.Quantity);
	} //main ends here
} //class ProductTest ends here
	