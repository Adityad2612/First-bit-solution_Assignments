#include<stdio.h>
#include<string.h>

void mystrlen(char *str);
void main()
{
	char str[] = "Aditya";
	
	mystrlen(str);
}
void mystrlen(char *str)
{
	int i =0;
	while(str[i] !='\0')
	{
		i++;
	}
	printf("Length of string is: %d",i);
}
