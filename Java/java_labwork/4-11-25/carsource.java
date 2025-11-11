class Car {
    String brand,model,color;
    double price,fuelCapacity;

	Car() //default constructor
	{
		System.out.println("Constructor is called");
		this.brand="BMW";
		this.model = "Audi";
		this.color = "Blue";
		this.price = 15000000;
		this.fuelCapacity = 15;
	}
	
	Car(String b,String m,String c,double p,double fc)
	{
		System.out.println("Parameterized constructor");
		this.brand=b;
		this.model=m;
		this.color=c;
		this.price=p;
		this.fuelCapacity=fc;
	}
		

    void setBrand(String b) {
        this.brand = b;
    }

    void setModel(String m) {
        this.model = m;
    }

    void setPrice(double p) {
        this.price = p;
    }

    void setColor(String c) {
        this.color = c;
    }

    void setFuelCapacity(double f) {
        this.fuelCapacity = f;
    }
	
	String getBrand()
	{
		return this.brand;
	}
	String getModel()
	{
		return this.model;
	}
	String getColor()
	{
		return this.color;
	}
	double getPrice()
	{
		return this.price;
	}
	double getFuelCapacity()
	{
		return this.fuelCapacity;
	}

	void display()
	{
		System.out.println("Brand name is:"+this.brand);
		System.out.println("Model name is:"+this.model);
		System.out.println("Price is:"+this.price);
		System.out.println("Color name is:"+this.color);
		System.out.println("Fuel capacity is:"+this.fuelCapacity);
}
} // class Car ends here

class CarTest {
    public static void main(String[] args) {
        Car c1 = new Car();
	Car c2 = new Car();
	Car c3 = new Car();
	Car c4 = new Car("Suzuki","Alto","Orange",250000,25);

        c1.setBrand("Toyota");
        c1.setModel("Camry");
        c1.setPrice(3200000);
        c1.setColor("White");
        c1.setFuelCapacity(55);

	c2.setBrand("Mahindra");
        c2.setModel("Thar");
        c2.setPrice(3200000);
        c2.setColor("Black");
        c2.setFuelCapacity(55);

	c1.getBrand();
        c1.getModel();
        c1.getPrice();
        c1.getColor();
        c1.getFuelCapacity();

	c2.getBrand();
        c2.getModel();
        c2.getPrice();
        c2.getColor();
        c2.getFuelCapacity();

	if(c1.getPrice() > c2.getPrice())
	{
		System.out.println("C1 is costlier");
	}else
		System.out.println("C2 is more costlier");

		c1.display();
		c2.display();
		c3.display();
		c4.display();

        System.out.println("Brand: " + c1.brand +"Model: " + c1.model +
"Price: " + c1.price +"Color: " + c1.color +"Fuel Capacity: " + c1.fuelCapacity + 
"liters");
    } // main ends here
} // class CarTest ends here
