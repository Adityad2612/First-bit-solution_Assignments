package lab;

class Instrument 
{
	String name;
	String type;
	double price;
	
	Instrument() //default constructor
	{
		this.name = "Generic Instrument";
		this.type = "Unknown";
		this.price = 1000.0;
	}
	
	Instrument(String n,String t,double p) //parameterized constructor
	{
		this.name = n;
		this.type = t;
		this.price = p;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	
	void play()
	{
		System.out.println("Instruments started to play");
	}
	
	void display()
	{
		System.out.println("Instrument Name: " + this.name);
		System.out.println("Type: " + this.type);
		System.out.println("Price: " + this.price);
	}

} // class Instrument ends here


class Guitar extends Instrument
{
	int numberOfStrings;
	
	Guitar() //default constructor
	{
		super();
		this.numberOfStrings = 6;
	}
	
	Guitar(String n,String t,double p,int strings) //parameterized constructor
	{
		super(n,t,p);
		this.numberOfStrings = strings;
	}
	
	public int getNumberOfStrings() {
		return numberOfStrings;
	}
	public void setNumberOfStrings(int numberOfStrings) {
		this.numberOfStrings = numberOfStrings;
	}
	
	void play()
	{
		System.out.println("Guitar started to play");
	}
	
	void display()
	{
		super.display();
		System.out.println("Number of Strings: " + this.numberOfStrings);
		System.out.println();
	}
	
} // class Guitar ends here


class Piano extends Instrument
{
	int numberOfKeys;
	
	Piano() //default constructor
	{
		super();
		this.numberOfKeys = 88;
	}
	
	Piano(String n,String t,double p,int keys) //parameterized constructor
	{
		super(n,t,p);
		this.numberOfKeys = keys;
	}
	
	public int getNumberOfKeys() {
		return numberOfKeys;
	}
	public void setNumberOfKeys(int numberOfKeys) {
		this.numberOfKeys = numberOfKeys;
	}
	
	void play()
	{
		System.out.println("Piano started to play");
	}
	
	void display()
	{
		super.display();
		System.out.println("Number of Keys: " + this.numberOfKeys);
		System.out.println();
	}
	
} // class Piano ends here


class Drum extends Instrument
{
	int drumSize;
	
	Drum() //default constructor
	{
		super();
		this.drumSize = 20;
	}
	
	Drum(String n,String t,double p,int size) //parameterized constructor
	{
		super(n,t,p);
		this.drumSize = size;
	}
	
	public int getDrumSize() {
		return drumSize;
	}
	public void setDrumSize(int drumSize) {
		this.drumSize = drumSize;
	}
	
	void play()
	{
		System.out.println("Drum started to play");
	}
	
	void display()
	{
		super.display();
		System.out.println("Drum Size: " + this.drumSize + " inches");
		System.out.println();
	}
	
} // class Drum ends here


class InstrumentTest
{
	public static void main(String[] args)
	{
		Instrument i1;
		System.out.println("--- Instrument ---");
		 i1 = new Instrument();
		 i1 = new Instrument("Flute","Wind",2000.0);
		 i1.display();
		 i1.play();
		 
		 System.out.println("--- Guitar Instrument ---");
		 i1 = new Guitar("Fender","String",35000.0,6);
		 i1.display();
		 i1.play();
		 
		 System.out.println("--- Piano Instrument ---");
		 i1 = new Piano("Yamaha","Keyboard",50000.0,88);
		 i1.display();
		 i1.play();
		 
		 System.out.println("--- Drum Instrument ---");
		 i1 = new Drum("Pearl","Percussion",30000.0,22);
		 i1.display();
		 i1.play();
		
			
	} // main ends here
	
} // class InstrumentTest ends here
