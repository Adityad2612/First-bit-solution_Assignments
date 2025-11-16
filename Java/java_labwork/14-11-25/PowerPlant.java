package lab;

abstract class PowerPlant {

	int plantId;
	String plantName;
	String location;
	double capacity; 
	int employeeCount;
	double annualProduction; 

	PowerPlant() // default constructor
	{
		this.plantId = 101;
		this.plantName = "Central Power Plant";
		this.location = "Maharashtra";
		this.capacity = 500.0;
		this.employeeCount = 200;
		this.annualProduction = 1500000.0;
	}

	PowerPlant(int plantId, String plantName, String location, double capacity, int employeeCount, double annualProduction) // parameterized constructor
	{
		this.plantId = plantId;
		this.plantName = plantName;
		this.location = location;
		this.capacity = capacity;
		this.employeeCount = employeeCount;
		this.annualProduction = annualProduction;
	}

	public int getPlantId() {
		return plantId;
	}

	public void setPlantId(int plantId) {
		this.plantId = plantId;
	}

	public String getPlantName() {
		return plantName;
	}

	public void setPlantName(String plantName) {
		this.plantName = plantName;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public double getCapacity() {
		return capacity;
	}

	public void setCapacity(double capacity) {
		this.capacity = capacity;
	}

	public int getEmployeeCount() {
		return employeeCount;
	}

	public void setEmployeeCount(int employeeCount) {
		this.employeeCount = employeeCount;
	}

	public double getAnnualProduction() {
		return annualProduction;
	}

	public void setAnnualProduction(double annualProduction) {
		this.annualProduction = annualProduction;
	}
	
	abstract void start();
	
	public String toString()
	{
		return "\nPlant ID: " + this.plantId + "\nPlant Name: " + this.plantName + "\nLocation: " + this.location +
				"\nCapacity (MW): " + this.capacity + "\nEmployee Count: " + this.employeeCount + 
				"\nAnnual Production (MWh): " + this.annualProduction;
	}

} // PowerPlant class ends here

class SolarPlant extends PowerPlant {

	int solarPanels;
	double areaCovered;
	double sunlightHours;

	SolarPlant() // default constructor
	{
		super();
		this.solarPanels = 10000;
		this.areaCovered = 25.5;
		this.sunlightHours = 8.0;
	}

	SolarPlant(int plantId, String plantName, String location, double capacity, int employeeCount, double annualProduction,
			   int solarPanels, double areaCovered, double sunlightHours) // parameterized constructor
	{
		super(plantId, plantName, location, capacity, employeeCount, annualProduction);
		this.solarPanels = solarPanels;
		this.areaCovered = areaCovered;
		this.sunlightHours = sunlightHours;
	}
	
	void start()
	{
		System.out.println("Start! started receiving solar energy");
	}
	
	public String toString()
	{
		return super.toString() + "\nNumber of Solar Panels: " + this.solarPanels + "\nArea Covered (acres): " + this.areaCovered +
				"\nSunlight Hours per Day: " + this.sunlightHours;
	}

} // SolarPlant class ends here

class HydroPlant extends PowerPlant {

	double waterFlowRate; 
	double damHeight;     
	int turbines;

	HydroPlant() // default constructor
	{
		super();
		this.waterFlowRate = 150.5;
		this.damHeight = 120.0;
		this.turbines = 6;
	}

	HydroPlant(int plantId, String plantName, String location, double capacity, int employeeCount, double annualProduction,
			   double waterFlowRate, double damHeight, int turbines) // parameterized constructor
	{
		super(plantId, plantName, location, capacity, employeeCount, annualProduction);
		this.waterFlowRate = waterFlowRate;
		this.damHeight = damHeight;
		this.turbines = turbines;
	}
	
	void start()
	{
		System.out.println("Start! started water turbines");
	}
	
	public String toString()
	{
		return super.toString() + "\nWater Flow Rate (m³/s): " + this.waterFlowRate + "\nDam Height (m): " + this.damHeight +
				"\nNumber of Turbines: " + this.turbines;
	}

} // HydroPlant class ends here

class WindPlant extends PowerPlant {

	int windTurbines;
	double averageWindSpeed;
	double rotorDiameter;

	WindPlant() // default constructor
	{
		super();
		this.windTurbines = 50;
		this.averageWindSpeed = 12.5;
		this.rotorDiameter = 80.0;
	}

	WindPlant(int plantId, String plantName, String location, double capacity, int employeeCount, double annualProduction,
			  int windTurbines, double averageWindSpeed, double rotorDiameter) // parameterized constructor
	{
		super(plantId, plantName, location, capacity, employeeCount, annualProduction);
		this.windTurbines = windTurbines;
		this.averageWindSpeed = averageWindSpeed;
		this.rotorDiameter = rotorDiameter;
	}
	
	void start()
	{
		System.out.println("Start! Started air turbines");
	}
	
	public String toString()
	{
		return super.toString() + "\nNumber of Wind Turbines: " + this.windTurbines + "\nAverage Wind Speed (m/s): " + this.averageWindSpeed +
				"\nRotor Diameter (m): " + this.rotorDiameter;
	}

} // WindPlant class ends here

class PowerPlantTest {

	public static void main(String[] args) 
	{
		PowerPlant p1;
		 
		 System.out.println("--- Solar power Plant ---");
		 p1 = new SolarPlant(103, "Green Solar", "Rajasthan", 250.0, 150, 900000.0, 15000, 40.5, 9.5);
		 System.out.println(p1.toString());
		 
		 System.out.println("--- Hydro power Plant ---");
		 p1 = new HydroPlant(104, "River Hydro", "Himachal", 400.0, 180, 1200000.0, 180.2, 130.0, 8);
		 System.out.println(p1.toString());
		 
		 System.out.println("--- wind power Plant ---");
		 p1 = new  WindPlant(105, "Windy Hills", "Tamil Nadu", 300.0, 160, 1000000.0, 75, 14.2, 90.0);
		 System.out.println(p1.toString());

	} //main ends here
} // PowerPlantTest class ends here
