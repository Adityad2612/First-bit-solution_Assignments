package dec_22;

import java.util.Scanner;

public class SumOfPairs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		int[] arr = new int[7]; //1 4 3 5 2 10 -4 no = 6
		
		System.out.println("Enter elements in array");
		
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		
		int sum = 6;
		System.out.println("Pairs are: ");
		for (int i = 0; i < arr.length; i++) {
			for (int j = i; j < arr.length; j++) {
				if(arr[i] + arr[j] == sum)
				{
					System.out.println(arr[i]+"," +arr[j]);
				}
			}
		}
	}

}
