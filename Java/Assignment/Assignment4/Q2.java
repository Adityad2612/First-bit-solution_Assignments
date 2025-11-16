package Assignment4;

public class Q2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=153;
		int r;
		int sum = 0;

		int temp = num;
		
		while(num > 0)
		{
		
		r = num % 10;
		sum = (sum + r*r*r);
		num = num / 10;
	}
		if(temp == sum)
		{
			System.out.printf("Numer is armstrong");
		}
		else
		{
			System.out.printf("Number is not armstrong");
		}
	}

}
