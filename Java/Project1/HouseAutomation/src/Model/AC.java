package Model;

public class AC extends Device implements TemperatureControllable {

	double humidityLevel;
	boolean inverterTechnology;
	int airFilterHealth;
	boolean turboMode;
	int sleepTimer;
	int temperature = 24;

	public AC(String name) {
		super(name);
	}

	@Override
	public void increaseTemp() {
		temperature++;
		System.out.println(name + ": Temperature increased to " + temperature);
	}

	@Override
	public void decreaseTemp() {
		temperature--;
		System.out.println(name + ": Temperature decreased to " + temperature);
	}

	public int getTemperature() {
		return temperature;
	}
}
