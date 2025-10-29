#include<stdio.h>

void upper();
void main()
{
	upper();
}
void upper()
{
	char ch = 'C';
	if(ch >= 'a' && ch <= 'z')
	{
		printf("Lower alphabet");
	}
	else
	{
		printf("Upper alphabet");
	}
}
