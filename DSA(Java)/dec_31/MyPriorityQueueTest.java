package dec_31;

import java.util.Scanner;

public class MyPriorityQueueTest {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter size of Priority Queue");
		int size = sc.nextInt();
		MyPriorityQueue s = new MyPriorityQueue(size);

		int choice;

		do {
			System.out.println("1. Enter uber car distance");
			System.out.println("2. Select nearest car distance");
			System.out.println("3. Display avaliable uber cars");
			System.out.println("4. Exit");

			choice = sc.nextInt();

			switch (choice) {
			case 1:
				System.out.println("Enter Distance");
				int ele = sc.nextInt();
				s.enque(ele);
				break;

			case 2:

				System.out.println("Nearest car distance is: " + s.deque());
				break;

			case 3:

				s.display();
				break;
			}

		} while (choice != 4);

		sc.close();
	}
}
