#include<stdio.h>

int triangle(int,int,int);
void main()
{
	int s1,s2,s3,r;
	printf("Enter one side");
	scanf("%d", &s1);
	
	printf("Enter second side");
	scanf("%d", &s2);
	
	printf("Enter third side");
	scanf("%d", &s3);
	
	r =triangle(s1,s2,s3);
	
	if(r==1)
	printf("Equilateral triangle");
	else if(r==2)
	printf("Isosceles triangle");
	else
	printf("Scalene triangle");
}
int triangle(int s1,int s2, int s3)
{
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
