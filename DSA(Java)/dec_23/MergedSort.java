package dec_23;

import java.util.Scanner;

public class MergedSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[7];
	
		
		System.out.println("Enter elements in array: ");
		
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		
		int start = 0,end = arr.length - 1;
		
		mergedSort(arr,start,end);
		
		System.out.println("Sorted array is: ");
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}

	}

	private static void mergedSort(int[] arr, int start, int end) {
		// TODO Auto-generated method stub
		int mid;
		if(start != end)
		{
			mid = (start + end) / 2;
			
			mergedSort(arr, start, mid);
			mergedSort(arr,mid + 1, end);
			combine(arr,start,mid,end);
		}
	}

	private static void combine(int[] arr, int start, int mid, int end) {
		// TODO Auto-generated method stub
		int i = start, j = mid + 1, k = 0;
		int[] n_arr = new int[end - start + 1];
		
		while(i <= mid && j <= end)
		{
			if(arr[i] < arr[j])
			{
				n_arr[k] = arr[i];
				k++;
				i++;
			}
			else
			{
				n_arr[k] = arr[j];
				k++;
				j++;
			}
		}
		while(i <= mid)
		{
			n_arr[k] = arr[i];
			k++;
			i++;
		}
		while(j <= end)
		{
			n_arr[k] = arr[j];
			k++;
			j++;
		}
		
		int y = start;
		for (int l = 0; l < n_arr.length; l++) {
			arr[y] = n_arr[l];
			y++;
		}
	}

}
