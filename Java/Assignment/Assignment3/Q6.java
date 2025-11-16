package Assignment3;

public class Q6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1=5; int num2=8;int r1;
		char op='*';
		if(op == '+')
		{
			r1 = num1 + num2;
			System.out.printf("%d", r1);
		}
		else if(op == '*')
		{
			r1 = num1 * num2;
			System.out.printf("%d", r1);
		}
		else if(op == '-')
		{
			r1 = num1 - num2;
			System.out.printf("%d", r1);
		}
	    else if (op == '/') 
		{
	        if (num2 != 0) 
			{
	            r1 = num1 / num2;
	            System.out.printf("%d", r1);
	        } 
			else 
			{
	            System.out.printf("can not be divided by zero");
	        }
	    }
	}

}
