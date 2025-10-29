#include<stdio.h>
#include<string.h>

char* mystrrev(char *str1);
void main()
{
	char str1[30] = "Aditya";
	
	mystrrev(str1);
}

char* mystrrev(char *str1)
{
	int i = 0,j = 0;
	char temp;
	
	while(str1[j] !='\0')
	{
		j++;
	}
	j--;
	while(i<j)
	{
		temp = str1[i];
		str1[i] = str1[j];
		str1[j] = temp;
		i++;
		j--;
	}
	printf("After reverse string %s",str1);
}
