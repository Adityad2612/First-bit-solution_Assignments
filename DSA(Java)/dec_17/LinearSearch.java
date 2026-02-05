package dec_17;

import java.util.Scanner;

public class LinearSearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr = new int[5];

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter values in array");

		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}

		int x = 15;

		int result = LinearSearch(arr, x);
		if (result != -1) {
			System.out.println("Present");
		} else {
			System.out.println("Not present");
		}

	}

	static int LinearSearch(int arr[], int x) {

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == x) {
				return i;
			}
		}
		return -1;

	}

}
