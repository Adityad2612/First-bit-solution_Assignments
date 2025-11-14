package lab;

public class Force {

	int troopsnum;
	double budget;
	int DeptNum;
	int VehicleNum;
	String HeadquaterLoc;
	String CountryName;
	int ManPowerCount;
	int MissionNum;
	int CauseltiesNum;
	String ChiefName;
	
	Force() //default constructor
	{
		this.troopsnum = 3000000;
		this.budget = 700000000;
		this.DeptNum = 22;
		this.VehicleNum = 15000;
		this.HeadquaterLoc = "Pune";
		this.CountryName = "India";
		this.ManPowerCount = 100000;
		this.MissionNum = 100;
		this.CauseltiesNum = 15000;
		this.ChiefName = "Gen Upendra Dwivedi";
		
	}

	public Force(int troopsnum, double budget, int deptNum, int vehicleNum, String headquaterLoc, String countryName,
			int manPowerCount, int missionNum, int causeltiesNum, String chiefName) //parameterized constructor
	{
		this.troopsnum = troopsnum;
		this.budget = budget;
		DeptNum = deptNum;
		VehicleNum = vehicleNum;
		HeadquaterLoc = headquaterLoc;
		CountryName = countryName;
		ManPowerCount = manPowerCount;
		MissionNum = missionNum;
		CauseltiesNum = causeltiesNum;
		ChiefName = chiefName;
	}

	public int getTroopsnum() {
		return troopsnum;
	}

	public void setTroopsnum(int troopsnum) {
		this.troopsnum = troopsnum;
	}

	public double getBudget() {
		return budget;
	}

	public void setBudget(double budget) {
		this.budget = budget;
	}

	public int getDeptNum() {
		return DeptNum;
	}

	public void setDeptNum(int deptNum) {
		DeptNum = deptNum;
	}

	public int getVehicleNum() {
		return VehicleNum;
	}

	public void setVehicleNum(int vehicleNum) {
		VehicleNum = vehicleNum;
	}

	public String getHeadquaterLoc() {
		return HeadquaterLoc;
	}

	public void setHeadquaterLoc(String headquaterLoc) {
		HeadquaterLoc = headquaterLoc;
	}

	public String getCountryName() {
		return CountryName;
	}

	public void setCountryName(String countryName) {
		CountryName = countryName;
	}

	public int getManPowerCount() {
		return ManPowerCount;
	}

	public void setManPowerCount(int manPowerCount) {
		ManPowerCount = manPowerCount;
	}

	public int getMissionNum() {
		return MissionNum;
	}

	public void setMissionNum(int missionNum) {
		MissionNum = missionNum;
	}

	public int getCauseltiesNum() {
		return CauseltiesNum;
	}

	public void setCauseltiesNum(int causeltiesNum) {
		CauseltiesNum = causeltiesNum;
	}

	public String getChiefName() {
		return ChiefName;
	}

	public void setChiefName(String chiefName) {
		ChiefName = chiefName;
	}
	
	void attack()
	{
		System.out.println("Attack!");
	}
	
	void display()
	{
		System.out.println("Number of troops is: "+this.troopsnum);
		System.out.println("Budget is: "+this.budget);
		System.out.println("Number of departments "+this.DeptNum);
		System.out.println("Number of vehicles: "+this.VehicleNum);
		System.out.println("Headquater location is: "+this.HeadquaterLoc);
		System.out.println("Country name is: "+this.CountryName);
		System.out.println("Man power is: "+this.ManPowerCount);
		System.out.println("Mission number is: "+this.MissionNum);
		System.out.println("Causalties number is: "+this.CauseltiesNum);
		System.out.println("Chief name is: "+this.ChiefName);
	}
	
} // class Force ends here

class Army extends Force
{
	int tanksNum;
	int GunsNum;
	int GranedsNum;
	int BattalionNum;
	
	Army() //default constructor
	{
		super();
		this.tanksNum = 540;
		this.GunsNum = 1000000;
		this.GranedsNum = 50000;
		this.BattalionNum = 80;
	}
	
	public Army(int troopsnum, double budget, int deptNum, int vehicleNum, String headquaterLoc, String countryName,
			int manPowerCount, int missionNum, int causeltiesNum, String chiefName,int tanksNum, int gunsNum, int granedsNum, int battalionNum) //parameterized constructor
	{
		super(troopsnum,budget,deptNum,vehicleNum,headquaterLoc,countryName,manPowerCount,missionNum,causeltiesNum,chiefName);
		this.tanksNum = tanksNum;
		GunsNum = gunsNum;
		GranedsNum = granedsNum;
		BattalionNum = battalionNum;
	}

	public int getTanksNum() {
		return tanksNum;
	}

	public void setTanksNum(int tanksNum) {
		this.tanksNum = tanksNum;
	}

	public int getGunsNum() {
		return GunsNum;
	}

	public void setGunsNum(int gunsNum) {
		GunsNum = gunsNum;
	}

	public int getGranedsNum() {
		return GranedsNum;
	}

	public void setGranedsNum(int granedsNum) {
		GranedsNum = granedsNum;
	}

	public int getBattalionNum() {
		return BattalionNum;
	}

	public void setBattalionNum(int battalionNum) {
		BattalionNum = battalionNum;
	}
	
	void attack()
	{
		System.out.println("Army Attack!");
	}
	
	void display()
	{
		super.display();
		System.out.println("Tanks number is: "+this.tanksNum);
		System.out.println("Guns Number: "+this.GunsNum);
		System.out.println("Graneds number is: "+this.GranedsNum);
		System.out.println("Number of battalion: "+this.BattalionNum);
		System.out.println();
		
	}	
} //Army class ends here

class Navy extends Force
{
	int ShipsNum;
	int SubmarinesNum;
	int TorpidoesNum;
	
	Navy() //default constructor
	{
		super();
		this.ShipsNum = 110;
		this.SubmarinesNum = 21;
		this.TorpidoesNum = 200;
	}

	public Navy(int troopsnum, double budget, int deptNum, int vehicleNum, String headquaterLoc, String countryName,
			int manPowerCount, int missionNum, int causeltiesNum, String chiefName,int shipsNum, int submarinesNum, int torpidoesNum) 
	{
		super(troopsnum,budget,deptNum,vehicleNum,headquaterLoc,countryName,manPowerCount,missionNum,causeltiesNum,chiefName);
		ShipsNum = shipsNum;
		SubmarinesNum = submarinesNum;
		TorpidoesNum = torpidoesNum;
	}

	public int getShipsNum() {
		return ShipsNum;
	}

	public void setShipsNum(int shipsNum) {
		ShipsNum = shipsNum;
	}

	public int getSubmarinesNum() {
		return SubmarinesNum;
	}

	public void setSubmarinesNum(int submarinesNum) {
		SubmarinesNum = submarinesNum;
	}

	public int getTorpidoesNum() {
		return TorpidoesNum;
	}

	public void setTorpidoesNum(int torpidoesNum) {
		TorpidoesNum = torpidoesNum;
	}
	
	void attack()
	{
		System.out.println("Navy Attack!");
	}
	
	void display()
	{
		super.display();
		System.out.println("Number of ships is: "+this.ShipsNum);
		System.out.println("Number of Submarines: "+this.SubmarinesNum);
		System.out.println("Number of Torpidoes is: "+this.TorpidoesNum);
		System.out.println();
	}
	
} // navy class ends here

class AirForce extends Force
{
	int MissilesNum;
	int AircraftNum;
	int SquadroneNum;
	
	AirForce() //default constructor
	{
		super();
		this.MissilesNum = 500;
		this.AircraftNum = 1020;
		this.SquadroneNum = 28;
	}

	public AirForce(int troopsnum, double budget, int deptNum, int vehicleNum, String headquaterLoc, String countryName,
			int manPowerCount, int missionNum, int causeltiesNum, String chiefName,int missilesNum, int aircraftNum, int squadroneNum) //Parameterized constructor
	{
		super(troopsnum,budget,deptNum,vehicleNum,headquaterLoc,countryName,manPowerCount,missionNum,causeltiesNum,chiefName);
		MissilesNum = missilesNum;
		AircraftNum = aircraftNum;
		SquadroneNum = squadroneNum;
	}

	public int getMissilesNum() {
		return MissilesNum;
	}

	public void setMissilesNum(int missilesNum) {
		MissilesNum = missilesNum;
	}

	public int getAircraftNum() {
		return AircraftNum;
	}

	public void setAircraftNum(int aircraftNum) {
		AircraftNum = aircraftNum;
	}

	public int getSquadroneNum() {
		return SquadroneNum;
	}

	public void setSquadroneNum(int squadroneNum) {
		SquadroneNum = squadroneNum;
	}
	
	void attack()
	{
		System.out.println("Air Force Attack!");
	}
	
	void display()
	{
		super.display();
		System.out.println("Number of missiles: "+this.MissilesNum);
		System.out.println("Number of aircraft: "+this.AircraftNum);
		System.out.println("Number of squadron: "+this.SquadroneNum);
		System.out.println();
	}
	
	
} //AirForce class ends here

class ForceTest 
{
	public static void main(String[] args)
	{
		Force f1;
		System.out.println("--- Force ---");
		 f1 = new Force();
		 f1 = new Force(10000,10000000,5,500,"Kabul","Afganistan",5000,5000,5000,"Hakkani");
		 f1.display();
		 System.out.println();
		 f1.attack();
		 f1 = new Army(10000,10000000,5,500,"Kabul","Afganistan",5000,5000,5000,"Hakkani",100, 200, 300, 50);
		 f1.display();
		 System.out.println();
		 f1.attack();
		 f1 = new Navy(10000,10000000,5,500,"Kabul","Afganistan",5000,5000,5000,"Hakkani",50,10,150);
		 f1.display();
		 System.out.println();
		 f1.attack();
		 f1 = new AirForce(10000,10000000,5,500,"Kabul","Afganistan",5000,5000,5000,"Hakkani",500,200,30);
		 f1.display();
		 System.out.println();
		 f1.attack();
		
		
	} // main ends here
} //ForceTest class ends here



