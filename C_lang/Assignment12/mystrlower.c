#include<stdio.h>
#include<string.h>

char* mystrlower(char *str1);
void main()
{
	char str1[30] = "ADITYA";
	mystrlower(str1);
}

char* mystrlower(char *str1)
{
	int i;
	while(str1[i] !='\0')
	{
		if(str1[i] >= 'A' && str1[i] <= 'Z')
		{
			str1[i] = str1[i] + 32;
			i++;
		}
	}
	printf("String using lower case: %s",str1);
}
