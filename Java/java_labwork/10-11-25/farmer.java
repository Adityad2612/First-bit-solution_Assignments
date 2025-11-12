package lab;

class Farmer {

	int FarmerId;
	String FarmerName;
	double LandArea;
	String City;
	double annualIncome;
	int EquipmentNum;
	double insuranceAmount;
	
	Farmer() //default constructor
	{
		this.FarmerId = 101;
		this.FarmerName = "Vijay";
		this.LandArea = 10;
		this.City = "Pune";
		this.annualIncome = 50000;
		this.EquipmentNum = 15;
		this.insuranceAmount = 500000;
	}

	Farmer(int farmerId, String farmerName, double landArea, String city, double annualIncome, int equipmentNum,
			double insuranceAmount) //parameterized constructor
	{
		this.FarmerId = farmerId;
		this.FarmerName = farmerName;
		this.LandArea = landArea;
		this.City = city;
		this.annualIncome = annualIncome;
		this.EquipmentNum = equipmentNum;
		this.insuranceAmount = insuranceAmount;
	}

	public int getFarmerId() {
		return FarmerId;
	}

	public void setFarmerId(int farmerId) {
		FarmerId = farmerId;
	}

	public String getFarmerName() {
		return FarmerName;
	}

	public void setFarmerName(String farmerName) {
		FarmerName = farmerName;
	}

	public double getLandArea() {
		return LandArea;
	}

	public void setLandArea(double landArea) {
		LandArea = landArea;
	}

	public String getCity() {
		return City;
	}

	public void setCity(String city) {
		City = city;
	}

	public double getAnnualIncome() {
		return annualIncome;
	}

	public void setAnnualIncome(double annualIncome) {
		this.annualIncome = annualIncome;
	}

	public int getEquipmentNum() {
		return EquipmentNum;
	}

	public void setEquipmentNum(int equipmentNum) {
		EquipmentNum = equipmentNum;
	}

	public double getInsuranceAmount() {
		return insuranceAmount;
	}

	public void setInsuranceAmount(double insuranceAmount) {
		this.insuranceAmount = insuranceAmount;
	}
	
	void display()
	{
		System.out.println("Farmer id is:"+this.FarmerId);
		System.out.println("Farmer name is: "+this.FarmerName);
		System.out.println("Land area is: "+this.LandArea);
		System.out.println("City is: "+this.City);
		System.out.println("Annual Income is: "+this.annualIncome);
		System.out.println("Number of equipement is: "+this.EquipmentNum);
		System.out.println("Insurance amount is: "+this.insuranceAmount);
	}

} //Farmer class ends here
 

class DairyFarmer extends Farmer
{
	int CattleNum;
	int MilkProducePerDay;
	int DairyLicenceNum;
	
	DairyFarmer() //default constructor
	{
		super();
		this.CattleNum = 80;
		this.MilkProducePerDay = 150;
		this.DairyLicenceNum = 101;
	}

	DairyFarmer(int farmerId, String farmerName, double landArea, String city, double annualIncome, int equipmentNum,
			double insuranceAmount, int cattleNum, int milkProducePerDay, int dairyLicenceNum) //parameterized constructor
	{
		super(farmerId, farmerName, landArea, city, annualIncome, equipmentNum, insuranceAmount);
		this.CattleNum = cattleNum;
		this.MilkProducePerDay = milkProducePerDay;
		this.DairyLicenceNum = dairyLicenceNum;
	}

	public int getCattleNum() {
		return CattleNum;
	}

	public void setCattleNum(int cattleNum) {
		CattleNum = cattleNum;
	}

	public int getMilkProducePerDay() {
		return MilkProducePerDay;
	}

	public void setMilkProducePerDay(int milkProducePerDay) {
		MilkProducePerDay = milkProducePerDay;
	}

	public int getDairyLicenceNum() {
		return DairyLicenceNum;
	}

	public void setDairyLicenceNum(int dairyLicenceNum) {
		DairyLicenceNum = dairyLicenceNum;
	}
	
	void display()
	{
		super.display();
		System.out.println("Number of cattles: "+this.CattleNum);
		System.out.println("Number of milk producing per day: "+this.MilkProducePerDay);
		System.out.println("Dairy Licence number is: "+this.DairyLicenceNum);
		System.out.println();
	}
} //Dairy Farmer class ends here
 

class PoultryFarmer extends Farmer
{
	String PoultryName;
	int ChikensNum;
	int HensNum;
	int ShadesNum;
	int eggsProducePerDay;
	
	PoultryFarmer() //default constructor
	{
		super();
		this.PoultryName = "Unknown";
		this.ChikensNum = 100;
		this.HensNum = 150;
		this.ShadesNum = 10;
		this.eggsProducePerDay = 1000;
		
	}

	PoultryFarmer(int farmerId, String farmerName, double landArea, String city, double annualIncome, int equipmentNum,
			double insuranceAmount, String poultryName, int chikensNum, int hensNum, int shadesNum, int eggsProducePerDay) //parameterized constructor
	{
		super(farmerId, farmerName, landArea, city, annualIncome, equipmentNum, insuranceAmount);
		this.PoultryName = poultryName;
		this.ChikensNum = chikensNum;
		this.HensNum = hensNum;
		this.ShadesNum = shadesNum;
		this.eggsProducePerDay = eggsProducePerDay;
	}

	public String getPoultryName() {
		return PoultryName;
	}

	public void setPoultryName(String poultryName) {
		PoultryName = poultryName;
	}

	public int getChikensNum() {
		return ChikensNum;
	}

	public void setChikensNum(int chikensNum) {
		ChikensNum = chikensNum;
	}

	public int getHensNum() {
		return HensNum;
	}

	public void setHensNum(int hensNum) {
		HensNum = hensNum;
	}

	public int getShadesNum() {
		return ShadesNum;
	}

	public void setShadesNum(int shadesNum) {
		ShadesNum = shadesNum;
	}

	public int getEggsProducePerDay() {
		return eggsProducePerDay;
	}

	public void setEggsProducePerDay(int eggsProducePerDay) {
		this.eggsProducePerDay = eggsProducePerDay;
	}
	
	void display()
	{
		super.display();
		System.out.println("Poultry name is: "+this.PoultryName);
		System.out.println("Number of chickens: "+this.ChikensNum);
		System.out.println("Number of hens: "+this.HensNum);
		System.out.println("Number of shades: "+this.ShadesNum);
		System.out.println("Eggs produced per day: "+this.eggsProducePerDay);
		System.out.println();
	}
} // PoultryFarmer class ends here
 

class OrganicFarmer extends Farmer
{
	int organicId;
	String cropType;
	String fertilizerUsed;
	
	OrganicFarmer() //default constructor
	{
		super();
		this.organicId = 501;
		this.cropType = "Wheat";
		this.fertilizerUsed = "Cow Dung";
	}
	
	OrganicFarmer(int farmerId, String farmerName, double landArea, String city, double annualIncome, int equipmentNum,
			double insuranceAmount, int organicId, String cropType, String fertilizerUsed) //parameterized constructor
	{
		super(farmerId, farmerName, landArea, city, annualIncome, equipmentNum, insuranceAmount);
		this.organicId = organicId;
		this.cropType = cropType;
		this.fertilizerUsed = fertilizerUsed;
	}

	public int getOrganicId() {
		return organicId;
	}

	public void setOrganicId(int organicId) {
		this.organicId = organicId;
	}

	public String getCropType() {
		return cropType;
	}

	public void setCropType(String cropType) {
		this.cropType = cropType;
	}

	public String getFertilizerUsed() {
		return fertilizerUsed;
	}

	public void setFertilizerUsed(String fertilizerUsed) {
		this.fertilizerUsed = fertilizerUsed;
	}
	
	void display()
	{
		super.display();
		System.out.println("Organic Id is: "+this.organicId);
		System.out.println("Crop type is: "+this.cropType);
		System.out.println("Fertilizer used is: "+this.fertilizerUsed);
		System.out.println();
	}
} //OrganicFarmer class ends here
 
class FarmerTest
{
	public static void main(String[] args)
	{
		System.out.println("--- Farmer ---");
		Farmer f1 = new Farmer();
		Farmer f2 = new Farmer(102,"Ramesh",12,"Nashik",65000,20,600000);
		
		f1.display();
		f2.display();
		
		System.out.println("--- Dairy Farmer ---");
		DairyFarmer d1 = new DairyFarmer();
		DairyFarmer d2 = new DairyFarmer(103,"Suresh",8,"Kolhapur",70000,10,400000,100,200,105);
		
		d1.display();
		d2.display();
		
		System.out.println("--- Poultry Farmer ---");
		PoultryFarmer p1 = new PoultryFarmer();
		PoultryFarmer p2 = new PoultryFarmer(104,"Mahesh",15,"Satara",80000,12,450000,"GoldenPoultry",200,250,15,1200);
		
		p1.display();
		p2.display();
		
		System.out.println("--- Organic Farmer ---");
		OrganicFarmer o1 = new OrganicFarmer();
		OrganicFarmer o2 = new OrganicFarmer(105,"Ganesh",9,"Nagpur",90000,18,550000,502,"Rice","Compost");
		
		o1.display();
		o2.display();
		
	} //main ends here
} //FarmerTest class ends here
