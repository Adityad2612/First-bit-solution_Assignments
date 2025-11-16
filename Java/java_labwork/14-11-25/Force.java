package lab;

abstract class Force {

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
	
	abstract void attack();

	public String toString()
	{
		return "\nNumber of troops is: "+this.troopsnum + "\nBudget is: "+this.budget + "\nNumber of departments "+this.DeptNum
				+ "\nNumber of vehicles: "+this.VehicleNum + "\nHeadquater location is: "+this.HeadquaterLoc + 
				"\nCountry name is: "+this.CountryName + "\nMan power is: "+this.ManPowerCount + "\nMission number is: "+this.MissionNum
				+ "\nCausalties number is: "+this.CauseltiesNum + "\nChief name is: "+this.ChiefName;
	}
	
	void display()
	{
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
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
	
	public String toString()
	{
		return super.toString() + "\nTanks number is: "+this.tanksNum + "\nGuns Number: "+this.GunsNum+
				"\nGraneds number is: "+this.GranedsNum + "\nNumber of battalion: "+this.BattalionNum;
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
	
	public String toString()
	{
		return super.toString() + "\nNumber of ships is: "+this.ShipsNum + "\nNumber of Submarines: "+this.SubmarinesNum
				+ "\nNumber of Torpidoes is: "+this.TorpidoesNum;
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
	
	public String toString()
	{
		return super.toString() + "\nNumber of missiles: "+this.MissilesNum +  "\nNumber of aircraft: "+this.AircraftNum +
				"\nNumber of squadron: "+this.SquadroneNum;
	}
	
} //AirForce class ends here

class ForceTest 
{
	public static void main(String[] args)
	{
		Force f1;
		
		System.out.println("--- Army ---");
		 f1 = new Army(10000,10000000,5,500,"Kabul","Afganistan",5000,5000,5000,"Hakkani",100, 200, 300, 50);
		 System.out.println(f1.toString());

		 System.out.println("--- Navy ---");
		 f1 = new Navy(10000,10000000,5,500,"Kabul","Afganistan",5000,5000,5000,"Hakkani",50,10,150);
		 System.out.println(f1.toString());

		 System.out.println("--- Air Force ---");
		 f1 = new AirForce(10000,10000000,5,500,"Kabul","Afganistan",5000,5000,5000,"Hakkani",500,200,30);
		 System.out.println(f1.toString());
		
	} // main ends here
} //ForceTest class ends here



