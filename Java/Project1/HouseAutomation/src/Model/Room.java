package Model;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Room {

	private String name;
	private ArrayList<Device> deviceList = new ArrayList<>();

	public Room(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	// Add device
	public boolean addDevice(Device device) {
		if (device == null) {
			return false;
		}

		// Prevent duplicate name
		for (Device d : deviceList) {
			if (d.getName().equals(device.getName())) {
				return false;
			}
		}

		deviceList.add(device);
		return true;
	}

	// Remove device by name
	public boolean removeDevice(String deviceName) {
		for (int i = 0; i < deviceList.size(); i++) {
			Device d = deviceList.get(i);
			if (d.getName().equals(deviceName)) {
				deviceList.remove(i);
				return true;
			}
		}
		return false;
	}

	// Get device by name
	public Device getDeviceByName(String deviceName) {
		for (Device d : deviceList) {
			if (d.getName().equals(deviceName)) {
				return d;
			}
		}
		return null;
	}

	public List<Device> getDevices() {
		return Collections.unmodifiableList(deviceList);
	}

	public String getRoomSummary() {
		StringBuilder sb = new StringBuilder("Room: " + name + "\n");
		for (Device d : deviceList) {
			sb.append(" - ").append(d.getName()).append(": ").append(d.getStatus()).append("\n");
		}
		return sb.toString();
	}

	public int getDevicesOnCount() {
		int count = 0;
		for (Device d : deviceList) {
			if (d.isOn()) {
				count++;
			}
		}
		return count;
	}

	public int getDevicesOffCount() {
		return deviceList.size() - getDevicesOnCount();
	}
}
