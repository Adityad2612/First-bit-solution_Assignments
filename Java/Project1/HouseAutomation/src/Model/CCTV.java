package Model;

public class CCTV extends Device {
	
	boolean tamperAlert;
	int zoomLevel;
	boolean twoWayAudio;
	int frameRate;
	boolean localStorageEnabled;

	public CCTV(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

	public void triggerAlarm() {
		System.out.println(name + ": Alaram triggered");
	}

	public void record() {
		System.out.println(name + ": Recording...");
	}
}
