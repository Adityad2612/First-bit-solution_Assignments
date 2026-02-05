package jan_1;

import java.util.Scanner;

public class MyLinkedListTest {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		MyLinkedList mll = new MyLinkedList();

		int choice, choice1;

		do {
			System.out.println("\n----- MENU -----");
			System.out.println("1. Insert element");
			System.out.println("2. Delete element");
			System.out.println("3. Display elements");
			System.out.println("4. Exit");

			choice = sc.nextInt();

			switch (choice) {

			case 1:
				System.out.println("1. Insert At Beginning");
				System.out.println("2. Insert At End");
				System.out.println("3. Insert At Position");

				choice1 = sc.nextInt();

				switch (choice1) {
				case 1:
					System.out.println("Enter element:");
					mll.insertbeg(sc.nextInt());
					break;

				case 2:
					System.out.println("Enter element:");
					mll.insertend(sc.nextInt());
					break;

				case 3:
					System.out.println("Enter position:");
					int pos = sc.nextInt();
					System.out.println("Enter element:");
					int ele = sc.nextInt();
					mll.insertPos(ele, pos);
					break;

				default:
					System.out.println("Invalid choice");
				}
				break;

			case 2:
			    System.out.println("1. Delete At Beginning");
			    System.out.println("2. Delete At End");
			    System.out.println("3. Delete At Position");

			    choice1 = sc.nextInt();

			    switch (choice1) {
			    case 1:
			        mll.deleteBeg();
			        break;

			    case 2:
			        mll.deleteEnd();
			        break;

			    case 3:
			        System.out.println("Enter position to delete:");
			        int dpos = sc.nextInt();
			        mll.deletePos(dpos);
			        break;

			    default:
			        System.out.println("Invalid choice");
			    }
			    break;


			case 3:
				mll.display();
				break;

			case 4:
				System.out.println("Exiting...");
				break;

			default:
				System.out.println("Invalid choice");
			}

		} while (choice != 4);

		sc.close();
	}
}
