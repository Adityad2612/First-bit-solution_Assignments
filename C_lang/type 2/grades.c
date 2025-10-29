#include<stdio.h>

int grade();
void main()
{
	int r;
	r =grade();
	
	if(r==1)
	printf("Distinction");
	else if(r==2)
	printf("First class");
	else if(r==3)
	printf("Secong class");
	else if(r==3)
	printf("Third class");
	else if(r==4)
	printf("Fail");
	else
	printf("Invalid marks");
}
int grade()
{
	int marks;
	
	printf("Enter marks\n");
	scanf("%d", &marks);
	
	if(marks > 75 && marks <=100)
	{
		return 1;
	}
	else if(marks >65 && marks <=75)
	{
		return 2;
	}
	else if(marks >55 && marks <=65)
	{
		return 3;
	}
	else if(marks > 40 && marks <=55)
	{
		return 4;
	}
	else if(marks <=40)
	{
		return 5;
	}
	else
	{
		return 6;
	}
}
