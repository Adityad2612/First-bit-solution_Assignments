package Main;

import Controller.HomeController;
import Exception.InvalidDeviceForRoomException;
import Model.AC;
import Model.SmartRobot;
import Model.Speaker;
import Model.Fan;
import Model.HomeModel;
import Model.Oven;
import Model.Light;
import Model.CCTV;
import View.View;

public class Main {

	public static void main(String[] args) {

		HomeModel model = new HomeModel();
		HomeController controller = new HomeController(model);
		View view = new View(controller);

		controller.addRoom("Living Room");
		controller.addRoom("Bedroom");
		controller.addRoom("Kitchen");
		controller.addRoom("Study Room");

		// -------- Living Room Devices --------
		try {
			controller.addDeviceToRoom("Living Room", new Speaker("TV"));
			controller.addDeviceToRoom("Living Room", new Light("Main Light"));
			controller.addDeviceToRoom("Living Room", new Fan("Ceiling Fan"));
			controller.addDeviceToRoom("Living Room", new CCTV("Door Camera"));

			// -------- Bedroom Devices --------
			controller.addDeviceToRoom("Bedroom", new AC("AC"));
			controller.addDeviceToRoom("Bedroom", new Light("Bed Lamp"));
			controller.addDeviceToRoom("Bedroom", new SmartRobot("Robo Cleaner"));

			// -------- Kitchen Devices --------
			controller.addDeviceToRoom("Kitchen", new Oven("Oven"));
			controller.addDeviceToRoom("Kitchen", new Light("Kitchen Light"));

			// -------- Study Room Devices --------
			controller.addDeviceToRoom("Study Room", new Light("Study Lamp"));

		} catch (InvalidDeviceForRoomException e) {
			System.out.println(e.getMessage());
		}

		// start UI
		view.start();
	}
}
