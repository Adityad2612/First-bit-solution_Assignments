#include<stdio.h>
#include<string.h>

void main()
{
	char str[] = "Aditya";
	char *sub = strstr(str,"dit");
	printf("%s",sub);
}
