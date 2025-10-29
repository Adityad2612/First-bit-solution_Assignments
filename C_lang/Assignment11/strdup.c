#include<stdio.h>
#include<string.h>

void main()
{
	char str[] = "Aditya";
	char *dup = strdup(str);
	printf("Original: %s\n",str);
	printf("duplicate: %s",dup);
}
