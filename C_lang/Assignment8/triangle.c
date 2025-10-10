#include<stdio.h>

int triangle(int *s1,int *s2, int *s3);
void main()
{
	int s1,s2,s3;
	printf("Enter one side");
	scanf("%d", &s1);
	
	printf("Enter second side");
	scanf("%d", &s2);
	
	printf("Enter third side");
	scanf("%d", &s3);
	
	triangle(&s1,&s2,&s3);
}
int triangle(int *s1,int *s2, int *s3)
{
	if(*s1 == *s2 && *s2 == *s3 && *s1 == *s3)
	{
		printf("This is equilateral triangle");
	}
	else if(*s1 == *s2 ||*s2 == *s3 || *s1 == *s3)
	{
		printf("This is isosceles triangle");
	}
	else if(*s1 != *s2 ||*s2 != *s3 || *s1 != *s3)
	{
		printf("This is Scalene triangle");
	}
	else
	{
		printf("Invalid input");
	}
}
