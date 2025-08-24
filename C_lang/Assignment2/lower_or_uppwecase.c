#include<stdio.h>

void main()
{
	char alpha= 'A';
	if(alpha >= 'a' && alpha <= 'z' || alpha >= 'A' && alpha <= 'Z')
	{
		printf("lowercase");
	}
	else
	{
		printf("Uppercase");
	}
}
