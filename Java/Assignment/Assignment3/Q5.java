package Assignment3;

public class Q5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int price=750;
		double discount;
		char student = '1';

		if(student == '1')
		{
			if(price > 500)
			{
				discount = price*0.2;
				System.out.printf("Discount is %.2f Rs", discount);
			}
			else
			{
				discount = price *0.1;
				System.out.printf("Discount is %.2f Rs", discount);
			}
		}
		else
		{
				if(price > 600)
				{
					discount = price*0.15;
					System.out.printf("Discount is %.2f Rs", discount);
				}
				else
				{
					System.out.printf("There is no discount");
				}
		}
	}

}
