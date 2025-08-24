void main()
{
	int total_marks,eng, mar, hindi, maths, sci, obtain_marks;
	float percent;
	eng = 17, mar = 18, hindi = 20, maths = 14, sci = 15;
	total_marks = 100; 
	obtain_marks = eng + mar + hindi + maths + sci;
	percent = ((float)obtain_marks/total_marks)*100;
	printf("A student obtained %d marks out of %d marks",obtain_marks, total_marks);
	printf("\nPercentage of marks is %f",percent);
}
