package Assignment4;

public class Q9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=157847;
		int r;int r1;

		r = num % 10;
		while(num >= 10)
		{
			num = num / 10;
		}
		r1 = num;
		System.out.printf("Sum of first and last number is %d", r + r1);
	}

}
