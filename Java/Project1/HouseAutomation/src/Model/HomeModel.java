package Model;

import java.util.ArrayList;

public class HomeModel {

	private ArrayList<Room> rooms;

	public HomeModel() {
		rooms = new ArrayList<>();
	}

	public boolean addRoom(String name) {

		if (roomExists(name)) {
			return false; // room already exists
		}
		rooms.add(new Room(name));
		return true;
	}

	public boolean removeRoom(String name) {
		Room roomToRemove = null;

		for (Room r : rooms) {
			if (r.getName().equalsIgnoreCase(name)) {
				roomToRemove = r;
				break;
			}
		}

		if (roomToRemove == null) {
			return false; // room does not exist
		}

		rooms.remove(roomToRemove);
		return true;
	}

	public boolean roomExists(String name) {

		for (Room r : rooms) {
			if (r.getName().equalsIgnoreCase(name)) {
				return true;
			}
		}
		return false;
	}

	public Room getRoom(String name) {
		for (Room r : rooms) {
			if (r.getName().equalsIgnoreCase(name)) {
				return r;
			}
		}
		return null;
	}

	public ArrayList<Room> getAllRooms() {
		return rooms;
	}
}
