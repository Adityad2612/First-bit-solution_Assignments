#include<stdio.h>

int palin();
void main()
{
	int r;
	r =palin();
	if(r==1)
	printf("Palindrome number");
	else
	printf("Not palindrome number");
}
int palin()
{
	int num;
	int r;
	int rev = 0;
	
	printf("Enter a number\n");
	scanf("%d", &num);
	
	int temp = num;
	
	while(num > 0)
	{
		r = num % 10;
		rev = rev * 10 + r;
		num = num / 10;
	}
	if(temp == rev)
	{
		return 1;
	}
	else
	{
		return 2;
	}
}
