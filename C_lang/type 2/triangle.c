#include<stdio.h>

int triangle();
void main()
{
	int r;
	r =triangle();
	
	if(r==1)
	printf("Equilateral triangle");
	else if(r==2)
	printf("isosceles triangle");
	else
	printf("Scalene triangle");
}
int triangle()
{
	int s1,s2,s3;
	printf("Enter one side");
	scanf("%d", &s1);
	
	printf("Enter second side");
	scanf("%d", &s2);
	
	printf("Enter third side");
	scanf("%d", &s3);
	
	if(s1 == s2 && s2 == s3 && s1 == s3)
	{
		return 1;
	}
	else if(s1 == s2 ||s2 == s3 || s1 == s3)
	{
		return 2;
	}
	else if(s1 != s2 ||s2 != s3 || s1 != s3)
	{
		return 3;
	}
	else
	{
		return 4;
	}
}
