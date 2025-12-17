package Model;

public class Oven extends Device {

	boolean preheatRequired;
	int maxLoadKg;
	String heatingMode;
	boolean childLock;
	int energyConsumption;
    int temperature;
    int timer; 

    public Oven(String name) {
        super(name);
        this.temperature = 180; 
        this.timer = 0;
    }

    // -------- TEMPERATURE --------
    public void setTemperature(int temperature) {
        if (temperature < 50 || temperature > 300) {
            System.out.println("Temperature must be between 50°C and 300°C");
            return;
        }
        this.temperature = temperature;
        System.out.println("Oven temperature set to " + temperature + "°C");
    }

    public void increaseTemperature() {
        setTemperature(this.temperature + 10);
    }

    public void decreaseTemperature() {
        setTemperature(this.temperature - 10);
    }
 
    //---------- Timer --------------
    public void setTimer(int minutes) {
        if (minutes <= 0) {
            System.out.println("Timer must be greater than 0");
            return;
        }
        this.timer = minutes;
        System.out.println("Oven timer set to " + minutes + " minutes");
    }

    public void start() {
        turnOn();
        System.out.println(
            "Oven started at " + temperature + "°C for " + timer + " minutes"
        );
    }

    public void stop() {
        turnOff();
        System.out.println("Oven stopped");
    }

    public void heat() {
        System.out.println("Heating at " + temperature + "°C");
    }
}
