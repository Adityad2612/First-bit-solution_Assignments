#include<stdio.h>

int div(int);
void main()
{
	int num,r;
	
	printf("Enter a numbers\n");
	scanf("%d", &num);
	
	r =div(num);
	
	if(r==1)
	printf("Divided by both 3 & 5");
	else if(r==2)
	printf("Divided by 3");
	else if(r==3)
	printf("Divided by 5");
	else
	printf("Invalid input");
}
int div(int num)
{
	if(num % 3 == 0 && num % 5 == 0)
	{
		return 1;
	}
	else if(num % 3 == 0)
	   {
			return 2;
		}
		else if(num % 5 == 0)
		{
			return 3;
		}
		else
		{
			return 4;
		}
}
