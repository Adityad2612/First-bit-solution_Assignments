package Assignment2;

public class Q7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double bs = 2000;
		double da; double ta; double hra;double total;
		if(bs <= 5000)
		{
			da = bs*0.1;
			ta = bs*0.2;
			hra = bs*0.25;
			total = bs + da + ta + hra;
			System.out.printf("%.2f", total);
		}
		else
		{
			da = bs*0.15;
			ta = bs*0.25;
			hra = bs*0.3;
			total = bs + da + ta + hra;
			System.out.printf("%.2f", total);	
		}
	}

}
