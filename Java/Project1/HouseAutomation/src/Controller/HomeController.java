package Controller;

import Model.AC;
import Model.SmartRobot;
import Model.Device;
import Model.Speaker;
import Model.Fan;
import Model.HomeModel;
import Model.Oven;
import Model.Light;
import Model.Room;
import Model.CCTV;

import Exception.InvalidDeviceForRoomException;

public class HomeController {

	HomeModel model;

	public HomeController(HomeModel model) {
		this.model = model;
	}

	// Room operations
	public boolean addRoom(String name) {
		return model.addRoom(name);
	}

	public boolean removeRoom(String name) {
		return model.removeRoom(name);
	}

	public Room getRoom(String name) {
		return model.getRoom(name);
	}

	public void showAllRoomsStatus() {
		for (Room r : model.getAllRooms()) {
			System.out.println(r.getRoomSummary());
		}
	}

	public boolean addDeviceToRoom(String roomName, Device device) throws InvalidDeviceForRoomException {

		Room r = model.getRoom(roomName);
		if (r == null)
			return false;

		if (roomName.equalsIgnoreCase("Kitchen")) {
			if (!(device instanceof Oven || device instanceof Light)) {
				throw new InvalidDeviceForRoomException("Kitchen allows only Oven and Light");
			}
		} else if (roomName.equalsIgnoreCase("Bedroom")) {
			if (!(device instanceof AC || device instanceof Light || device instanceof Fan
					|| device instanceof SmartRobot)) {
				throw new InvalidDeviceForRoomException("Invalid device for Bedroom");
			}
		} else if (roomName.equalsIgnoreCase("Living Room")) {
			if (!(device instanceof Speaker || device instanceof Light || device instanceof Fan
					|| device instanceof CCTV)) {
				throw new InvalidDeviceForRoomException("Invalid device for Living Room");
			}
		}

		return r.addDevice(device);
	}

	public boolean removeDeviceFromRoom(String roomName, String deviceName) {
		Room r = model.getRoom(roomName);
		if (r == null)
			return false;
		return r.removeDevice(deviceName);
	}

	public boolean turnOnDevice(String roomName, String deviceName) {
		Room r = model.getRoom(roomName);
		if (r == null)
			return false;

		Device d = r.getDeviceByName(deviceName);
		if (d == null)
			return false;
		d.turnOn();
		return true;
	}

	public boolean turnOffDevice(String roomName, String deviceName) {
		Room r = model.getRoom(roomName);
		if (r == null)
			return false;
		Device d = r.getDeviceByName(deviceName);
		if (d == null)
			return false;
		d.turnOff();
		return true;
	}

	public boolean updateDeviceAction(String roomName, String deviceName, int action) {
		Room r = model.getRoom(roomName);
		if (r == null)
			return false;
		Device d = r.getDeviceByName(deviceName);
		if (d == null)
			return false;

		if (d instanceof Speaker) {
			Speaker ed = (Speaker) d;
			if (action == 1)
				ed.volumeUp();
			else if (action == 2)
				ed.volumeDown();
			else
				return false;
			return true;
		} else if (d instanceof Light) {
			Light ld = (Light) d;
			if (action == 1)
				ld.increaseBrightness();
			else if (action == 2)
				ld.decreaseBrightness();
			else
				return false;
			return true;
		} else if (d instanceof Fan) {
			Fan fd = (Fan) d;
			if (action == 1)
				fd.increaseSpeed();
			else if (action == 2)
				fd.decreaseSpeed();
			else
				return false;
			return true;
		} else if (d instanceof AC) {
			AC ac = (AC) d;
			if (action == 1)
				ac.increaseTemp();
			else if (action == 2)
				ac.decreaseTemp();
			else
				return false;
			return true;
		} else if (d instanceof CCTV) {
			CCTV sd = (CCTV) d;

			if (action == 1)
				sd.record();
			else if (action == 2)
				sd.triggerAlarm();
			else
				return false;
			return true;
		} else if (d instanceof SmartRobot) {
			SmartRobot cd = (SmartRobot) d;
			if (action == 1)
				cd.startCleaning();
			else if (action == 2)
				cd.stopCleaning();
			else if (action == 3)
				cd.pauseCleaning();
			else if (action == 4)
				cd.resumeCleaning();
			else
				return false;
			return true;
		} else if (d instanceof Oven) {
			Oven kd = (Oven) d;
			if (action == 1)
				kd.start();
			else if (action == 2)
				kd.stop();
			else if (action == 3)
			    kd.setTimer(action);
			else if (action == 4)
			    kd.heat();

			else
				return false;
			return true;
		} else {
			return false;
		}
	}

	public boolean validateRoom(String name) {
		return model.roomExists(name);
	}
}
