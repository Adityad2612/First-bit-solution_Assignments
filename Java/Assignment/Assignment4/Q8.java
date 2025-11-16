package Assignment4;

public class Q8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=6;
		int fact;
		int sum = 0;
		int i; int r;
		
		int temp = num;

		while(num > 0)
		{
			r = num % 10;
			fact = 1;
			i = 1;
			
		while(i <= r)
		{
		fact = fact * i;
		i++;
		}
		
		sum = sum + fact;
		num = num / 10;
		
		}
		
		if(sum == temp)
		{
			System.out.printf("Strong number");
		}
		else
		{
			System.out.printf("Not strong number");
		}
	}

}
