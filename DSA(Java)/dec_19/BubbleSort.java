package dec_19;

import java.util.Scanner;

class Bubblesort {

	static boolean flag;
	static int loop = 0;

	public static void main(String[] args) {

		int[] arr = new int[6];
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter elements in array");

		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}

		BubbleSort(arr);

		System.out.println("Sorted array:");
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}

	private static void BubbleSort(int[] arr) {

		int temp, itcount = 0, swapcount = 0;

		for (int i = 0; i < arr.length - 1; i++) {

			flag = true;   

			for (int j = 0; j < arr.length - 1 - i; j++) {

				loop++;

				if (arr[j] > arr[j + 1]) {
					temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;

					swapcount++;
					flag = false; 
				}
			}

			itcount++;

			if (flag) { 
				System.out.println("Loop break at iteration and total iteration: " + itcount);
				break;
			}
		}

		//System.out.println("Total iterations: " + itcount);
		System.out.println("Total swaps: " + swapcount);
	}
}
