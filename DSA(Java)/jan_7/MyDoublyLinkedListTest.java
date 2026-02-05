package jan_7;

import java.util.Scanner;

public class MyDoublyLinkedListTest {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		MyDoublyLinkedList<Employee> dll = new MyDoublyLinkedList<>(null, null);

		int choice;

		do {
			System.out.println("1. Insert at position");
			System.out.println("2. Insert at last");
			System.out.println("3. Delete at position");
			System.out.println("4. Display forward");
			System.out.println("5. Display backward");
			System.out.println("6. Exit");
			System.out.print("Enter your choice: ");

			choice = sc.nextInt();

			switch (choice) {

			case 1:
				System.out.print("Enter id,name,salary: ");
				int eid = sc.nextInt();
				String name = sc.next();
				double sal = sc.nextDouble();
				Employee e = new Employee(eid, name, sal);

				System.out.print("Enter position: ");
				int pos = sc.nextInt();

				dll.insertOpti(e, pos);
				System.out.println("Element inserted at position " + pos);
				break;

//			case 2:
//				int ele;
//				System.out.print("Enter element: ");
//				ele = sc.nextInt();
//
//				dll.insertAtLast(ele);
//				System.out.println("Element inserted at last");
//				break;

			case 3:
				System.out.print("Enter position to delete: ");
				pos = sc.nextInt();

				dll.delete(pos);
				System.out.println("Element deleted from position " + pos);
				break;

			case 4:
				System.out.println("List (Forward):");
				dll.displayFwd();
				break;

			case 5:
				System.out.println("List (Backward):");
				dll.displayBack();
				break;

			case 6:
				System.out.println("Exiting... Have a good day");
				break;

			default:
				System.out.println("Invalid choice! Try again.");
			}

		} while (choice != 6);

		sc.close();
	}
}
