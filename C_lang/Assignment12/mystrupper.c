#include<stdio.h>
#include<string.h>

char* mystrupper(char *str1);
void main()
{
	char str1[30] = "aditya";
	mystrupper(str1);
}

char* mystrupper(char *str1)
{
	int i;
	while(str1[i] !='\0')
	{
		if(str1[i] >= 'a' && str1[i] <= 'z')
		{
			str1[i] = str1[i] - 32;
			i++;
		}
	}
	printf("String using upper case: %s",str1);
}
