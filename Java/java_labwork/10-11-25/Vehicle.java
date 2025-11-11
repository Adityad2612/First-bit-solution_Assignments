package lab;



class Vehicle 
{
	int vehicleId;
	String brand;
	double price;

	Vehicle() // default constructor
	{
		this.vehicleId = 1;
		this.brand = "Generic";
		this.price = 500000;
	}

	Vehicle(int id, String brand, double price) // parameterized constructor
	{
		this.vehicleId = id;
		this.brand = brand;
		this.price = price;
	}

	public int getVehicleId() {
		return vehicleId;
	}

	public void setVehicleId(int vehicleId) {
		this.vehicleId = vehicleId;
	}

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

	void display() {
		System.out.println("Vehicle ID: " + this.vehicleId);
		System.out.println("Brand: " + this.brand);
		System.out.println("Price: " + this.price);
	}
} // Vehicle ends here


class Car extends Vehicle
{
	int doors;
	String fuelType;

	Car() // default constructor
	{
		super();
		this.doors = 4;
		this.fuelType = "Petrol";
	}

	Car(int id, String brand, double price, int doors) //parameterized constructor
	{
		super(id, brand, price);
		this.doors = doors;
	}

	public int getDoors() {
		return doors;
	}

	public void setDoors(int doors) {
		this.doors = doors;
	}

	void display() {
		super.display();
		System.out.println("Doors: " + this.doors);
		System.out.println();
	}
} // Car ends here


class Bike extends Vehicle
{
	String type;
	boolean hasDiscBrake;

	Bike() // default constructor
	{
		super();
		this.type = "Sport";
		this.hasDiscBrake = true;
	}

	Bike(int id, String brand, double price, String type, boolean hasDiscBrake) //parameterized constructor
	{
		super(id, brand, price);
		this.type = type;
		this.hasDiscBrake = hasDiscBrake;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public boolean isHasDiscBrake() {
		return hasDiscBrake;
	}

	public void setHasDiscBrake(boolean hasDiscBrake) {
		this.hasDiscBrake = hasDiscBrake;
	}

	void display() {
		super.display();
		System.out.println("Bike Type: " + this.type);
		System.out.println("Has Disc Brake: " + this.hasDiscBrake);
		System.out.println();
	}
} // Bike ends here


class Truck extends Vehicle
{
	double loadCapacity;
	int wheels;

	Truck() // default constructor
	{
		super();
		this.loadCapacity = 10.0;
	}

	Truck(int id, String brand, double price, double loadCapacity) //parameterized constructor
	{
		super(id, brand, price);
		this.loadCapacity = loadCapacity;
	}

	public double getLoadCapacity() {
		return loadCapacity;
	}

	public void setLoadCapacity(double loadCapacity) {
		this.loadCapacity = loadCapacity;
	}

	void display() {
		super.display();
		System.out.println("Load Capacity (tons): " + this.loadCapacity);
		System.out.println();
	}
} // Truck ends here


class VehicleTest
{
	public static void main(String[] args)
	{
		Vehicle v1 = new Vehicle();
		Vehicle v2 = new Vehicle(2, "Tata", 700000);

		Car c1 = new Car();
		Car c2 = new Car(3, "Hyundai", 900000, 4);

		Bike b1 = new Bike();
		Bike b2 = new Bike(4, "Yamaha", 150000, "Cruiser", true);

		Truck t1 = new Truck();
		Truck t2 = new Truck(5, "Ashok Leyland", 2500000, 15.0);

		System.out.println("\n--- Vehicle Objects ---");
		v1.display();
		v2.display();

		System.out.println("\n--- Car Objects ---");
		c1.display();
		c2.display();

		System.out.println("\n--- Bike Objects ---");
		b1.display();
		b2.display();

		System.out.println("\n--- Truck Objects ---");
		t1.display();
		t2.display();
	}
} // VehicleTest ends here

