#include<stdio.h>
#include<string.h>

char* mystrcat(char *str1,char *str2);
void main()
{
	char str1[] = "Aditya";
	char str2[] = "Durgude";
	
	mystrcat(str1,str2);
}

char* mystrcat(char *str1,char *str2)
{
	int i=0,j=0;
	int len1 = strlen(str1);
	int len2 = strlen(str2);
	while(str1[i] !='\0')
	{
		i++;
	}
		while(str2[j] !='\0')
		{
			str1[i] = str2[j];
			i++;
			j++;
		}
		str1[i] = '\0';
		printf("String 2 after adding into string 1: %s",str1);
}
