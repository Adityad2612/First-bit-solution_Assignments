package Assignment3;

public class Q4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=15;
		
		if(num % 3 == 0 && num % 5 == 0)
		{
			System.out.printf("Number is divided by both 3 & 5");
		}
		else if(num % 3 == 0)
		   {
				System.out.printf("Number is divided by 3");
			}
			else if(num % 5 == 0)
			{
				System.out.printf("Number is divided by 5");
			}
			else
			{
				System.out.printf("Neither divided by both numbers");
			}
	}

}
