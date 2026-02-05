package dec_18;

import java.util.Scanner;

public class BinarySearch
{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);

		int[] arr = new int[10];
		System.out.println("Enter elements in array");
		int x = 22;
		
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		int res = BinarySeach(arr,x);
		
		if(res == -1)
		{
			System.out.println("Not found");
		}else
		{
			System.out.println("Found");
		}
	}


	private static int BinarySeach(int[] arr, int x) {
		// TODO Auto-generated method stub
		int start = 0, end = arr.length-1;
		int mid;
		while(start <= end)
		{
			mid = (start + end)/2;
			
			if(arr[mid] == x)
			{
				return mid;
			}else if(arr[mid] > x)
			{
				end = mid - 1;
			}else
			{
				start = mid +1;
			}
			
		}
		return -1;
		
	}

}
