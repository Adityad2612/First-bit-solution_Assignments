package dec_29;

import java.util.Scanner;

public class MyQueueTest {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter size of Queue");
		int size = sc.nextInt();
		Patient p = new Patient(size);

		int choice;

		do {
			System.out.println("1. enque");
			System.out.println("2. deque");
			System.out.println("3. display");
			System.out.println("4. Exit");

			choice = sc.nextInt();

			switch (choice) {
			case 1:
				sc.nextLine();
				System.out.println("Enter String");
				String str = sc.nextLine();
				p.enque(str);
				System.out.println("String added successfully: "+str);
				break;

			case 2:

				System.out.println(p.deque());
				System.out.println("String is deleted successfully");
				break;

			case 3:

				System.out.println(p.display());
				break;
			}

		} while (choice != 4);

		sc.close();
	}
}
