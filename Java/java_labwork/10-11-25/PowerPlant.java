package lab;

class PowerPlant {

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

	void display() {
		System.out.println("Plant ID: " + this.plantId);
		System.out.println("Plant Name: " + this.plantName);
		System.out.println("Location: " + this.location);
		System.out.println("Capacity (MW): " + this.capacity);
		System.out.println("Employee Count: " + this.employeeCount);
		System.out.println("Annual Production (MWh): " + this.annualProduction);
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

	void display() {
		super.display();
		System.out.println("Number of Solar Panels: " + this.solarPanels);
		System.out.println("Area Covered (acres): " + this.areaCovered);
		System.out.println("Sunlight Hours per Day: " + this.sunlightHours);
		System.out.println();
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

	void display() {
		super.display();
		System.out.println("Water Flow Rate (m³/s): " + this.waterFlowRate);
		System.out.println("Dam Height (m): " + this.damHeight);
		System.out.println("Number of Turbines: " + this.turbines);
		System.out.println();
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

	void display() {
		super.display();
		System.out.println("Number of Wind Turbines: " + this.windTurbines);
		System.out.println("Average Wind Speed (m/s): " + this.averageWindSpeed);
		System.out.println("Rotor Diameter (m): " + this.rotorDiameter);
		System.out.println();
	}
} // WindPlant class ends here

class PowerPlantTest {

	public static void main(String[] args) 
	{

		System.out.println("--- Power Plant ---");
		PowerPlant p1 = new PowerPlant();
		PowerPlant p2 = new PowerPlant(102, "Eastern Power Plant", "Karnataka", 700.0, 300, 2500000.0);

		p1.display();
		System.out.println();
		p2.display();
		System.out.println();

		System.out.println("--- Solar power Plant ---");
		SolarPlant s1 = new SolarPlant();
		SolarPlant s2 = new SolarPlant(103, "Green Solar", "Rajasthan", 250.0, 150, 900000.0, 15000, 40.5, 9.5);

		s1.display();
		s2.display();

		System.out.println("--- Hydro power Plant ---");
		HydroPlant h1 = new HydroPlant();
		HydroPlant h2 = new HydroPlant(104, "River Hydro", "Himachal", 400.0, 180, 1200000.0, 180.2, 130.0, 8);

		h1.display();
		h2.display();

		System.out.println("--- wind power Plant ---");
		WindPlant w1 = new WindPlant();
		WindPlant w2 = new WindPlant(105, "Windy Hills", "Tamil Nadu", 300.0, 160, 1000000.0, 75, 14.2, 90.0);

		w1.display();
		w2.display();
	} //main ends here
} // PowerPlantTest class ends here
