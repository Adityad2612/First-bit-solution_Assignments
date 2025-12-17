package Model;

public abstract class Device {

	String brand;
	String modelNumber;
	String serialNumber;
	int manufacturingYear;
	int warrantyYears;
	String name;
	boolean isOn = false;
	long stateStartTime;

	public Device(String name) {
		this.name = name;
	}

	public void turnOn() {
		isOn = true;
		stateStartTime = System.currentTimeMillis();
		System.out.println(name + " turned ON");
	}

	public void turnOff() {
		isOn = false;
		System.out.println(name + " turned OFF");
	}

	public long getTimeInState() {
		if (!isOn) {
			return 0;
		}
		return System.currentTimeMillis() - stateStartTime;
	}

	public boolean isOn() {
		return isOn;
	}

	public String getStatus() {
		long ms = getTimeInState();
		long seconds = ms / 1000;
		long minutes = seconds / 60;
		long hours = minutes / 60;

		seconds = seconds % 60;
		minutes = minutes % 60;

		String time = String.format("%02d hrs %02d mins %02d sec", hours, minutes, seconds);

		return name + " is " + (isOn ? "ON" : "OFF") + " | Running: " + time;
	}

	public String getName() {
		return name;
	}
}
