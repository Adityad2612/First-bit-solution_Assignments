package Assignment1;

public class Q8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int total_marks,eng, mar, hindi, maths, sci, obtain_marks;
		float percent;
		eng = 17;mar = 18;hindi = 20;maths = 14;sci = 15;
		total_marks = 100; 
		obtain_marks = eng + mar + hindi + maths + sci;
		percent = ((float)obtain_marks/total_marks)*100;
		System.out.printf("A student obtained %d marks out of %d",obtain_marks, total_marks);
		System.out.printf("\nPercentage of marks is %.2f",percent);
	}

}
