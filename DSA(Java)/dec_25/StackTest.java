package dec_25;

import java.util.Scanner;

public class StackTest {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter size of stack");
		int size = sc.nextInt();
		Stack s = new Stack(size);

		int choice;

		do {
			System.out.println("1. Push");
			System.out.println("2. Pop");
			System.out.println("3. Peak");
			System.out.println("4. Exit");

			choice = sc.nextInt();

			switch (choice) {
			case 1:
				System.out.println("Enter elements");
				int ele = sc.nextInt();
				s.push(ele);
				break;

			case 2:

				System.out.println("Pop element is: " + s.pop());
				break;

			case 3:

				System.out.println("Top element is: " + s.peak());
				break;
			}

		} while (choice != 4);

		sc.close();
	}
}
