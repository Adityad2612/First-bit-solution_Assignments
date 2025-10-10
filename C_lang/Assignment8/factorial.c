#include<stdio.h>

int facto(int *num,int *fact);
void main()
{
	int num;
	int fact = 1;
	
	printf("Enter a number\n");
	scanf("%d", &num);
	facto(&num,&fact);
}
int facto(int *num, int *fact)
{
	while(*num > 0)
	{
		*fact = *fact * *num;
		(*num)--;
	}
	printf("%d", *fact);
}
