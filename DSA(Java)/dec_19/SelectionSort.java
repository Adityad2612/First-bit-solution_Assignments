package dec_19;

import java.util.Scanner;

public class SelectionSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr = new int[6];
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter elements in array");

		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		
		Selectionsort(arr);
		System.out.println("Sorted elements: ");
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}

	private static void Selectionsort(int[] arr) {
		// TODO Auto-generated method stub
		
		int min,m_index;
		
		for (int i = 0; i < arr.length-1; i++) {
			min = arr[i];
			m_index = i;
			for (int j = i+1; j < arr.length; j++) {
				if(min > arr[j])
				{
					min = arr[j];
					m_index = j;
				}
			}
			arr[m_index] = arr[i];
			arr[i] = min;
		}
	}

}
