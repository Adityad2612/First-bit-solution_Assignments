#include<stdio.h>

int dis(int,int,char);
void main()
{
	int price,discount,r;
	char student = '1';
	printf("Enter price\n");
	scanf("%d", &price);
	
	fflush(stdin);
	
	printf("Enter whether you are student or not\n");
	scanf("%c", &student);
	
	r =dis(price,discount,student);
	printf("%d",r);
	if(r==1)
	printf("No discount");
}
int dis(int price, int discount, char student)
{
	if(student == '1')
	{
		if(price > 500)
		{
			discount = price*0.2;
			return discount;
		}
		else
		{
			discount = price *0.1;
			return discount;
		}
	}
	else
	{
			if(price > 600)
			{
				discount = price*0.15;
				return discount;
			}
			else
			{
				return 1;
			}
	}
}
