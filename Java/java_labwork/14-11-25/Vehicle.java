package lab;

abstract class Vehicle 
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
	
	abstract void brake();
	
	public String toString()
	{
		return "\nVehicle ID: " + this.vehicleId + "\nBrand: " + this.brand + "\nPrice: " + this.price;
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
	
	void brake()
	{
		System.out.println("Drum brake applied!");
	}
	
	public String toString()
	{
		return super.toString()+"\nDoors: " + this.doors;
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
	
	void brake()
	{
		System.out.println("Disk brake applied!");
	}
	
	public String toString()
	{
		return super.toString()+"\nBike Type: " + this.type + "\nHas Disc Brake: " + this.hasDiscBrake;
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

	void brake()
	{
		System.out.println("Air brake applied!");
	}
	
	public String toString()
	{
		return  super.toString()+"\nLoad Capacity (tons): " + this.loadCapacity;
	}
	
	
} // Truck ends here


class VehicleTest
{
	public static void main(String[] args)
	{
		Vehicle v1;
		 
		System.out.println("--- Car ---");
		 v1 = new Car(3, "Hyundai", 900000, 4);
		 System.out.println(v1.toString());
		 
		 System.out.println("--- Bike ---");
		 v1 = new Bike(4, "Yamaha", 150000, "Cruiser", true);
		 System.out.println(v1.toString());
		 
		 System.out.println("--- Truck ---");
		 v1 = new Truck(5, "Ashok Leyland", 2500000, 15.0);
		 System.out.println(v1.toString());
		 
	}
} // VehicleTest ends here

