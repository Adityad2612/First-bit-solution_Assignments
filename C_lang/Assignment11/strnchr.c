#include<stdio.h>
#include<string.h>

void main()
{
	char str[] = "India";
	char *ptr = strrchr(str,'i');
	printf("%s",ptr);
}
