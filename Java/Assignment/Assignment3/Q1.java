package Assignment3;

public class Q1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int age;
		
		age = 25;
		
		if(age < 12)
		{
			System.out.printf("Child");
		}
		else if(age >= 12 && age <=19)
		{
			System.out.printf("Teenager");
		}
		else if(age >= 20 && age <= 59)
		{
			System.out.printf("Adult");
		}
		else if(age >60)
		{
			System.out.printf("Senior");
		}
	}

}
