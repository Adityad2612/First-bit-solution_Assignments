package Assignment4;

public class Q5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=6;
		int i = 1;
		int sum = 0;

		while(i < num)
		{
			if(num % i == 0)
			{
			
			sum = sum + i;
		    } 
		    i++;
		}
		if(num == sum)
		{
			System.out.printf("Number is perfect number");
		}
		else
		{
			System.out.printf("Number is not perfect number");
		}
	}

}
