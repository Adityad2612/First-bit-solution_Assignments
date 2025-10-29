#include<stdio.h>
#include<string.h>

void main()
{
	char str[] = "Aditya";
	char *ptr = strchr(str,'i');
	printf("%s",ptr);
}
