package lab;

abstract class Appliance
{
	String brand;
	double price;
	int powerRating; 
	
	Appliance() // default constructor
	{
		this.brand = "Samsung";
		this.price = 25000;
		this.powerRating = 1200;
	}
	
	Appliance(String brand, double price, int powerRating) // parameterized constructor
	{
		this.brand = brand;
		this.price = price;
		this.powerRating = powerRating;
	}
	
	// getter and setter 
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public int getPowerRating() {
		return powerRating;
	}
	public void setPowerRating(int powerRating) {
		this.powerRating = powerRating;
	}
	
	abstract void start();
	
	public String toString() 
	{
	    return "Brand: " + this.brand +" Price: " + this.price +" Power Rating: " + this.powerRating + "W";
	}

	
} // class Appliance ends here


class WashingMachine extends Appliance
{
	int drumSize; 
	
	WashingMachine() // default constructor
	{
		super();
		this.drumSize = 7;
	}
	
	WashingMachine(String brand, double price, int powerRating, int drumSize) // parameterized constructor
	{
		super(brand, price, powerRating);
		this.drumSize = drumSize;
	}
	
	// getter and setter 
	public int getDrumSize() {
		return drumSize;
	}
	public void setDrumSize(int drumSize) {
		this.drumSize = drumSize;
	}
	
	void start()
	{
		System.out.println("Washing machine started intakeing water");
	}
	
	public String toString()
	{
		
		return super.toString()+"Drum Size: " + this.drumSize + "kg";
	}
	
} // class WashingMachine ends here


class Refrigerator extends Appliance
{
	int capacity; 
	
	Refrigerator() // default constructor
	{
		super();
		this.capacity = 300;
	}
	
	Refrigerator(String brand, double price, int powerRating, int capacity) // parameterized constructor
	{
		super(brand, price, powerRating);
		this.capacity = capacity;
	}
	
	// getter and setter 
	public int getCapacity() {
		return capacity;
	}
	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}
	
	void start()
	{
		System.out.println("Refrigerator started cooling!");
	}
	
	public String toString()
	{
		
		return super.toString()+"Capacity: " + this.capacity + "L" ;
	}
	
	void display()
	{
		System.out.println();
		System.out.println();
	}
	
} // class Refrigerator ends here


class Microwave extends Appliance
{
	int volume; 
	
	Microwave() // default constructor
	{
		super();
		this.volume = 25;
	}
	
	Microwave(String brand, double price, int powerRating, int volume) // parameterized constructor
	{
		super(brand, price, powerRating);
		this.volume = volume;
	}
	
	// getter and setter 
	public int getVolume() {
		return volume;
	}
	public void setVolume(int volume) {
		this.volume = volume;
	}
	
	void start()
	{
		System.out.println("Microwave started heating food!");
	}
	
	public String toString()
	{
		
		return super.toString()+"Volume: " + this.volume + "L";
	}
	
} // class Microwave ends here


class ApplianceTest
{
	public static void main(String[] args)
	{
		Appliance a1;
		
		System.out.println("--- WashingMachine ---");
		 a1 = new WashingMachine("Whirlpool", 32000, 1500, 8);
		 System.out.println(a1.toString());
		 
		 System.out.println("--- Refrigerator ---");
		 a1 = new Refrigerator("Godrej", 40000, 1300, 350);
		 System.out.println(a1.toString());
		 
		 System.out.println("--- Microwave ---");
		 a1 = new Microwave("Panasonic", 15000, 800, 30);
		 System.out.println(a1.toString());
		 
		
	} // main ends here
	
} // class ApplianceTest ends here
