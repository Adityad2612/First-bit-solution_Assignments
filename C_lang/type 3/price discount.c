#include<stdio.h>

int dis(int,int,char);
void main()
{
	int price,discount;
	char student = '1';
	printf("Enter price\n");
	scanf("%d", &price);
	
	fflush(stdin);
	
	printf("Enter whether you are student or not\n");
	scanf("%c", &student);
	
	dis(price,discount,student);
}
int dis(int price, int discount, char student)
{
	if(student == '1')
	{
		if(price > 500)
		{
			discount = price*0.2;
			printf("Discount is %d Rs", discount);
		}
		else
		{
			discount = price *0.1;
			printf("Discount is %d Rs", discount);
		}
	}
	else
	{
			if(price > 600)
			{
				discount = price*0.15;
				printf("Discount is %d Rs", discount);
			}
			else
			{
				printf("There is no discount");
			}
	}
}
