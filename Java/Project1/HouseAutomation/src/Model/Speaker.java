package Model;

public class Speaker extends Device implements VolumeControllable {

	int bassLevel;
	boolean bluetoothConnected;
	int equalizerPreset;
	boolean surroundSound;
	int batteryPercentage;
	int volume = 10;

	public Speaker(String name) {
		super(name);
	}

	@Override
	public void volumeUp() {
		volume++;
		System.out.println(name + ": Volume increased to " + volume);
	}

	@Override
	public void volumeDown() {
		if (volume > 0)
			volume--;
		System.out.println(name + ": Volume decreased to " + volume);
	}

	public int getVolume() {
		return volume;
	}
}
