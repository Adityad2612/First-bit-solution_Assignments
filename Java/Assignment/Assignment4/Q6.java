package Assignment4;

public class Q6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=17;
		int i = 2;
		int flag = 0;   //prime

		while(i < num)
		{
			if(num % i == 0)
			{
				flag = 1;    //not prime
				break;
			}
			i++;
		} 
		if(flag == 0)
		{
			System.out.printf("Number is prime");
		}
		else
		{
			System.out.printf("Number is not prime");
		}
	}

}
