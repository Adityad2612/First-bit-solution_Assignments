package jan_1;

import java.util.Scanner;

public class MyLinkedCountTest {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		MyLinkedListCount mll = new MyLinkedListCount();

		int choice, choice1;

		do {
			System.out.println("1. Insert element");
			System.out.println("2. Delete element");
			System.out.println("3. Display elements");
			System.out.println("4. Display Count");
			System.out.println("5. Find prime Numbers");
			System.out.println("6. Sort elements");
			System.out.println("7. Reverse list");
			System.out.println("8. Exit");

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
					System.out.println("Count of elements: " + mll.size());
					break;

				case 2:
					System.out.println("Enter element:");
					mll.insertend(sc.nextInt());
					System.out.println("Count of elements: " + mll.size());
					break;

				case 3:
					System.out.println("Enter position:");
					int pos = sc.nextInt();
					System.out.println("Enter element:");
					int ele = sc.nextInt();
					mll.insertPos(ele, pos);
					System.out.println("Count of elements: " + mll.size());
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
					System.out.println("Count of elements: " + mll.size());
					break;

				case 2:
					mll.deleteEnd();
					mll.size();
					break;

				case 3:
					System.out.println("Enter position to delete:");
					int dpos = sc.nextInt();
					mll.deletePos(dpos);
					System.out.println("Count of elements: " + mll.size());
					break;

				default:
					System.out.println("Invalid choice");
				}
				break;

			case 3:
				mll.display();
				break;

			case 4:
				System.out.println("Count of elements: " + mll.size());
				mll.size();
				break;

			case 5:
				mll.isPrimeNumber();
				break;

			case 6:
				System.out.println("1. Sort Ascending");
				System.out.println("2. Sort Descending");

				choice1 = sc.nextInt();

				switch (choice1) {
				case 1:
					mll.sortingAscending();
					System.out.println("List sorted in ascending order");
					mll.display();
					break;

				case 2:
					mll.sortingDescending();
					System.out.println("List sorted in descending order");
					mll.display();
					break;

				default:
					System.out.println("Invalid choice");
				}
				break;

			case 7:
				System.out.println("List in reverse order");
				mll.recursive(mll.Start);
				break;

			case 8:
				System.out.println("Exiting...Have a good day!");
				break;

			default:
				System.out.println("Invalid choice");
			}

		} while (choice != 8);

		sc.close();
	}
}
