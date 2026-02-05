package jan_10;

import java.util.Scanner;

public class StackSLLTest {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		StackSLL s = new StackSLL();

		int choice;

		do {
			System.out.println("1. Push");
			System.out.println("2. Pop");
			System.out.println("3. Peek");
			System.out.println("4. Display");
			System.out.println("5. Exit");

			choice = sc.nextInt();

			switch (choice) {

			case 1:
				System.out.println("Enter element:");
				s.push(sc.nextInt());
				break;

			case 2:
				System.out.println("Popped element: " + s.pop());
				break;

			case 3:
				System.out.println("Top element: " + s.peek());
				break;

			case 4:
				s.display();
				break;

			case 5:
				System.out.println("Exiting...");
				break;

			default:
				System.out.println("Invalid choice");
			}

		} while (choice != 5);

		sc.close();
	}
}
