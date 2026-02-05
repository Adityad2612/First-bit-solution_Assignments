package dec_25;

import java.util.Scanner;

public class TextEditorTest {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter size of stack");
		int size = sc.nextInt();
		TextEditor te = new TextEditor(size);

		int choice;

		do {
			System.out.println("1. Write a line");
			System.out.println("2. Undo");
			System.out.println("3. Display Current text");
			System.out.println("4. Exit");

			choice = sc.nextInt();

			switch (choice) {
			case 1:
				sc.nextLine();
				System.out.println("Enter String");
				String str = sc.nextLine();
				te.push(str);
				System.out.println("Line added successfully: "+str);
				break;

			case 2:

				System.out.println("Pop element is: " + te.pop());
				System.out.println("String is deleted successfully");
				break;

			case 3:

				System.out.println("Top element is: " + te.peak());
				break;
			}

		} while (choice != 4);

		sc.close();
	}
}
