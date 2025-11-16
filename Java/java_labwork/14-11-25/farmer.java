package lab;

abstract class Farmer {

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
	
	abstract void receivedSubSidy();

	public String toString()
	{
		return "\nFarmer id is:"+this.FarmerId + "\nFarmer name is: "+this.FarmerName + "\nLand area is: "+this.LandArea
				+ "\nCity is: "+this.City + "\nAnnual Income is: "+this.annualIncome + "\nNumber of equipement is: "+this.EquipmentNum
				+ "\nInsurance amount is: "+this.insuranceAmount;
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
	
	void receivedSubSidy()
	{
		System.out.println("Rs 5000 Subsidy received!");
	}
	
	public String toString()
	{
		return super.toString() + "\nNumber of cattles: "+this.CattleNum + "\nNumber of milk producing per day: "+this.MilkProducePerDay
				+ "\nDairy Licence number is: "+this.DairyLicenceNum;
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
	
	void receivedSubSidy()
	{
		System.out.println("Rs 1000000 Subsidy received!");
	}
	
	public String toString()
	{
		return super.toString() + "\n"+this.PoultryName + "\nNumber of chickens: "+this.ChikensNum
				+ "\nNumber of hens: "+this.HensNum + "\nNumber of shades: "+this.ShadesNum +
				"\nEggs produced per day: "+this.eggsProducePerDay;
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
	
	public String toString()
	{
		return super.toString() + "\nOrganic Id is: "+this.organicId + "\nCrop type is: "+this.cropType +
				"\nFertilizer used is: "+this.fertilizerUsed;
	}

	@Override
	void receivedSubSidy() {
		// TODO Auto-generated method stub
		
	}
	
} //OrganicFarmer class ends here
 
class FarmerTest 
{
	public static void main(String[] args)
	{
		Farmer f1;
		 
		 System.out.println("--- Dairy Farmer ---");
		 f1 = new DairyFarmer(103,"Suresh",8,"Kolhapur",70000,10,400000,100,200,105);
		 System.out.println(f1.toString());

		 System.out.println("--- Poultry Farmer ---");
		 f1 = new PoultryFarmer(104,"Mahesh",15,"Satara",80000,12,450000,"GoldenPoultry",200,250,15,1200);
		 System.out.println(f1.toString());
		 
		 System.out.println("--- Organic Farmer ---");
		 f1 = new OrganicFarmer(105,"Ganesh",9,"Nagpur",90000,18,550000,502,"Rice","Compost");
		 System.out.println(f1.toString());
		
	} //main ends here
} //FarmerTest class ends here
