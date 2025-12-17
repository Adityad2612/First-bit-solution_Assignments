package View;

import Controller.HomeController;

import Model.AC;
import Model.SmartRobot;
import Model.Device;
import Model.Speaker;
import Model.Fan;
import Model.Oven;
import Model.Light;
import Model.Room;
import Model.CCTV;

import Exception.InvalidDeviceForRoomException;

import java.util.Scanner;

public class View {

	HomeController controller;
	Scanner sc = new Scanner(System.in);

	public View(HomeController controller) {
		this.controller = controller;
	}

	void showMainMenu() {
		System.out.println("\n--- Home Menu ---");
		System.out.println("1. Add Room");
		System.out.println("2. Remove Room");
		System.out.println("3. Enter Room");
		System.out.println("4. Show All Rooms");
		System.out.println("5. Exit");
		System.out.print("Choose: ");
	}

	void addRoom() {
		System.out.print("Enter room name: ");
		String name = sc.nextLine().trim();
		if (controller.addRoom(name))
			System.out.println("Room added.");
		else
			System.out.println("Could not add room (already existed).");
	}

	void removeRoom() {
		System.out.print("Enter room name to remove: ");
		String name = sc.nextLine().trim();
		if (controller.removeRoom(name))
			System.out.println("Room removed.");
		else
			System.out.println("Room not found.");
	}

	void enterRoom() {
		System.out.print("Enter room name: ");
		String roomName = sc.nextLine().trim();
		if (!controller.validateRoom(roomName)) {
			System.out.println("Room doesn't exist.");
			return;
		}
		roomMenu(roomName);
	}

	public void start() {
		while (true) {
			showMainMenu();
			int ch = readInt();
			switch (ch) {
			case 1 -> addRoom();
			case 2 -> removeRoom();
			case 3 -> enterRoom();
			case 4 -> controller.showAllRoomsStatus();
			case 5 -> {
				System.out.println("Exiting.");
				return;
			}
			default -> System.out.println("Invalid option.");
			}
		}
	}

	void roomMenu(String roomName) {
		while (true) {
			System.out.println("\n--- Room: " + roomName + " ---");
			System.out.println("1. Add Device");
			System.out.println("2. Remove Device");
			System.out.println("3. Update Device ");
			System.out.println("4. Turn ON Device");
			System.out.println("5. Turn OFF Device");
			System.out.println("6. Show All Devices");
			System.out.println("7. Back to Main Menu");
			System.out.print("Choose: ");
			int ch = readInt();
			switch (ch) {
			case 1 -> addDeviceToRoom(roomName);
			case 2 -> removeDeviceFromRoom(roomName);
			case 3 -> updateDevice(roomName);
			case 4 -> turnOnDevice(roomName);
			case 5 -> turnOffDevice(roomName);
			case 6 -> showDevices(roomName);
			case 7 -> {
				return;
			}
			default -> System.out.println("Invalid option.");
			}
		}
	}

	void addDeviceToRoom(String roomName) {
		System.out.println("Choose device type to add:");
		System.out.println("1. Speaker");
		System.out.println("2. AC");
		System.out.println("3. Light");
		System.out.println("4. Fan");
		System.out.println("5. CCTV");
		System.out.println("6. Smart Robot");
		System.out.println("7. Oven");
		System.out.print("Type: ");
		int type = readInt();
		System.out.print("Enter device name (unique device): ");
		String devName = sc.nextLine().trim();
		Device d = switch (type) {
		case 1 -> new Speaker(devName);
		case 2 -> new AC(devName);
		case 3 -> new Light(devName);
		case 4 -> new Fan(devName);
		case 5 -> new CCTV(devName);
		case 6 -> new SmartRobot(devName);
		case 7 -> new Oven(devName);
		default -> null;
		};
		if (d == null) {
			System.out.println("Invalid type.");
			return;
		}

		try {
			boolean added = controller.addDeviceToRoom(roomName, d);
			System.out.println(added ? "Device added." : "can not add device due to duplicate name");
		} catch (InvalidDeviceForRoomException e) {
			System.out.println(e.getMessage());
		}
	}

	void removeDeviceFromRoom(String roomName) {
		System.out.print("Enter device name to remove: ");
		String dev = sc.nextLine().trim();
		boolean removed = controller.removeDeviceFromRoom(roomName, dev);
		System.out.println(removed ? "Device removed." : "Device not found.");
	}

	void updateDevice(String roomName) {
		System.out.print("Enter device name to update: ");
		String devName = sc.nextLine().trim();
		Room r = controller.getRoom(roomName);
		Device d = r.getDeviceByName(devName);
		if (d == null) {
			System.out.println("Device not found.");
			return;
		}

		if (d instanceof Speaker) {
			System.out.println("1. Volume Up\n2. Volume Down");
			int a = readInt();
			controller.updateDeviceAction(roomName, devName, a);
		} else if (d instanceof Light) {
			System.out.println("1. Brightness Up\n2. Brightness Down");
			int a = readInt();
			controller.updateDeviceAction(roomName, devName, a);
		} else if (d instanceof Fan) {
			System.out.println("1. Speed Up\n2. Speed Down");
			int a = readInt();
			controller.updateDeviceAction(roomName, devName, a);
		} else if (d instanceof AC) {
			System.out.println("1. Temp Up\n2. Temp Down");
			int a = readInt();
			controller.updateDeviceAction(roomName, devName, a);
		} else if (d instanceof CCTV) {
			System.out.println("1. Record\n2. Trigger Alarm");
			int a = readInt();
			controller.updateDeviceAction(roomName, devName, a);
		} else if (d instanceof SmartRobot) {
			System.out.println("1. Start\n2. Stop\n3. Pause\n4. Resume");
			int a = readInt();
			controller.updateDeviceAction(roomName, devName, a);
		} else if (d instanceof Oven) {
			System.out.println("1. Start\n2. Stop\n3. Set Timer\n4. Increase Temperature\n5. Decrease Temperature");
					int a = readInt();
					controller.updateDeviceAction(roomName, devName, a);

			int a1 = readInt();
			controller.updateDeviceAction(roomName, devName, a1);
		} else {
			System.out.println("No update options for this device.");
		}
	}

	void turnOnDevice(String roomName) {
		System.out.print("Enter device name to turn ON: ");
		String dev = sc.nextLine().trim();
		boolean ok = controller.turnOnDevice(roomName, dev);
		System.out.println(ok ? "Turned ON." : "Device not found.");
	}

	void turnOffDevice(String roomName) {
		System.out.print("Enter device name to turn OFF: ");
		String dev = sc.nextLine().trim();
		boolean ok = controller.turnOffDevice(roomName, dev);
		System.out.println(ok ? "Turned OFF." : "Device not found.");
	}

	void showDevices(String roomName) {
		Room r = controller.getRoom(roomName);
		if (r == null) {
			System.out.println("Room not found.");
			return;
		}
		System.out.println("\n" + r.getRoomSummary());
	}

	int readInt() {
		try {
			String line = sc.nextLine();
			return Integer.parseInt(line.trim());
		} catch (Exception e) {
			return -1;
		}
	}
}
