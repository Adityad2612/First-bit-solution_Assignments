package Model;

public class Fan extends Device implements SpeedControllable {

	int airflowRate;
	boolean remoteControlEnabled;
	int noiseLevel;
	boolean autoOff;
	String mountingType;
	int speed = 1;

	public Fan(String name) {
		super(name);
	}

	@Override
	public void increaseSpeed() {
		speed++;
		System.out.println(name + ": Speed increased to " + speed);
	}

	@Override
	public void decreaseSpeed() {
		if (speed > 0)
			speed--;
		System.out.println(name + ": Speed decreased to " + speed);
	}

	public int getSpeed() {
		return speed;
	}
}
