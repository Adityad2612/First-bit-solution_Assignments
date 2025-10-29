#include<stdio.h>
#include<string.h>

void main()
{
	char str[] = "Aditya Durgude";
	char dest[20];
	strcpy(dest,str);
	printf("String after copied: %s",dest);
}
