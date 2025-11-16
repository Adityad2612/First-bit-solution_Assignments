package Assignment2;

public class Q5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 121;
		int r1, r2, q1, rev, r3;
		r1 = num % 10;
		q1 = num / 10;
		r2 = q1 % 10;
		r3 = q1 / 10;
		
		rev = r1*100 + r2*10 + r3;
		System.out.printf("%d", rev);
		
		if(num == rev)
		{
			System.out.printf("\nNumber is Palindrome");
		}
		else
		{
			System.out.printf("\nNumber is not Palindrome");
		}
	}

}
