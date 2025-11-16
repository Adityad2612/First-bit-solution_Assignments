package Assignment3;

public class Q2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int s1=5; int s2=8; int s3=2;
		
		if(s1 == s2 && s2 == s3 && s1 == s3)
		{
			System.out.printf("This is equilateral triangle");
		}
		else if(s1 == s2 ||s2 == s3 || s1 == s3)
		{
			System.out.printf("This is isosceles triangle");
		}
		else if(s1 != s2 ||s2 != s3 || s1 != s3)
		{
			System.out.printf("This is Scalene triangle");
		}
	}

}
