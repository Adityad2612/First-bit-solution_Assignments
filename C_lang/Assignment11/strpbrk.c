#include<stdio.h>
#include<string.h>

void main()
{
	char str[] = "Aditya";
	char *ptr = strpbrk(str,"y");
	printf("%s",ptr);
}
