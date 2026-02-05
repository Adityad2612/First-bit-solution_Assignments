package dec_16;

import java.util.Scanner;
import java.util.Arrays;

class SortingArray {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int[] array1 = new int[5];
		int[] array2 = new int[5];
		int[] array3 = new int[array1.length + array2.length];

		System.out.println("Enter elements in first array:");
		for (int i = 0; i < array1.length; i++) {
			array1[i] = sc.nextInt();
		}

		System.out.println("Enter elements in second array:");
		for (int i = 0; i < array2.length; i++) {
			array2[i] = sc.nextInt();
		}

		for (int k = 0; k < array3.length; k++) {
			if (array1[k] > array2[k]) {
				array3[k] = array2[k];
			} else if (array2[k] > array1[k]) {
				array3[k] = array1[k];
			}
			System.out.println(array3[k]);
		}

	}
}
