package dec_22;

import java.util.Scanner;

public class InsertionSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		int[] arr = new int[6];
		
		System.out.println("Enter elements in array");
		
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
			
			insertSort(arr);
			
			System.out.println("Sorted array is: ");
			for (int j = 0; j < arr.length; j++) {
				System.out.println(arr[j]);
			}

	}

	private static void insertSort(int[] arr) {
		// TODO Auto-generated method stub
		
		int x,j;
		
		for (int i = 0; i < arr.length; i++) {
			x = arr[i];
			j = i-1;
			
			while(j >= 0 )// && arr[j] > x)
			{
				if(arr[j] > x)
				{
					arr[j+1] = arr[j];
					j--;
				}else // not require
					break; //
			}
			arr[j+1] = x;
		}
	}

}
