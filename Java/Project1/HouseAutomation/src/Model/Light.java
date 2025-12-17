package Model;

public class Light extends Device implements BrightnessControllable {

	boolean motionSensorEnabled;
	boolean ambientSensor;
	int warmUpTime;
	int lifespanHours;
	boolean flickerFree;
	int brightness = 5;

	public Light(String name) {
		super(name);
	}

	@Override
	public void increaseBrightness() {
		brightness++;
		System.out.println(name + ": Brightness increased to " + brightness);
	}

	@Override
	public void decreaseBrightness() {
		if (brightness > 0)
			brightness--;
		System.out.println(name + ": Brightness decreased to " + brightness);
	}

	public int getBrightness() {
		return brightness;
	}
}
