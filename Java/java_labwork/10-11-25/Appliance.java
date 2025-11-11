package lab;

class Appliance
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
	
	void display()
	{
		System.out.println("Brand: " + this.brand);
		System.out.println("Price: " + this.price);
		System.out.println("Power Rating: " + this.powerRating + "W");
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
	
	void display()
	{
		super.display();
		System.out.println("Drum Size: " + this.drumSize + "kg");
		System.out.println();
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
	
	void display()
	{
		super.display();
		System.out.println("Capacity: " + this.capacity + "L");
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
	
	void display()
	{
		super.display();
		System.out.println("Volume: " + this.volume + "L");
		System.out.println();
	}
	
} // class Microwave ends here


class ApplianceTest
{
	public static void main(String[] args)
	{
		System.out.println("--- Appliance ---");
		Appliance a1 = new Appliance();
		Appliance a2 = new Appliance("LG", 18000, 1000);
		
		a1.display();
		a2.display();
		
		System.out.println("--- WashingMachine ---");
		WashingMachine w1 = new WashingMachine();
		WashingMachine w2 = new WashingMachine("Whirlpool", 32000, 1500, 8);
		
		w1.display();
		w2.display();
		
		System.out.println("--- Refrigerator ---");
		Refrigerator r1 = new Refrigerator();
		Refrigerator r2 = new Refrigerator("Godrej", 40000, 1300, 350);
		
		r1.display();
		r2.display();
		
		System.out.println("--- Microwave ---");
		Microwave m1 = new Microwave();
		Microwave m2 = new Microwave("Panasonic", 15000, 800, 30);
		
		m1.display();
		m2.display();
	} // main ends here
	
} // class ApplianceTest ends here
