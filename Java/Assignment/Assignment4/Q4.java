package Assignment4;

public class Q4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=140;
		int r;
		int rev = 0;

		int temp = num;
		
		while(num > 0)
		{
			r = num % 10;
			rev = rev * 10 + r;
			num = num / 10;
		}
		if(temp == rev)
		{
			System.out.printf("Number is palindrome");
		}
		else
		{
			System.out.printf("Number is not palindrome");
		}
	}

}
