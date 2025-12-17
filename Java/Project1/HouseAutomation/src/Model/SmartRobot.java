package Model;

public class SmartRobot extends Device {

	int batteryLevel;
	boolean obstacleAvoidance;
	String cleaningPattern;
	int dustbinCapacity;
	boolean autoDocking;
	
	public SmartRobot(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

	public void startCleaning() {
		System.out.println(name + ": Cleaning started");
	}

	public void stopCleaning() {
		System.out.println(name + ": Cleaning stopped");
	}

	public void pauseCleaning() {
		System.out.println(name + ": Paused");
	}

	public void resumeCleaning() {
		System.out.println(name + ": Resumed");
	}
}
