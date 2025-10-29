#include<stdio.h>
#include<string.h>

void main()
{
	char str[] = "Aditya Durgude";
	char dest[20];
	strncpy(dest,str,9);
	dest[9] = '\0';
	printf("String after copied: %s",dest);
}
