#include<stdio.h>

int palin(int,int,int,int);
void main()
{
	int num;
	int r,res;
	int rev = 0;
	
	printf("Enter a number\n");
	scanf("%d", &num);
	
	int temp = num;
	res =palin(num,r,rev,temp);
	if(res==1)
	printf("Number is palindrome");
	else
	printf("Number is not palindrome");
}
int palin(int num, int r, int rev, int temp)
{
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
