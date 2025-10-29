#include<stdio.h>
#include<string.h>

void main()
{
	char str1[] = "Aditya";
	char str2[] = "Durgude";
	strncat(str1,str2,6);
	printf("String after adding: %s",str1);
}
