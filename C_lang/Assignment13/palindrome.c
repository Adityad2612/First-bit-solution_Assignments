#include<stdio.h>
#include<string.h>

void main()
{
	char str1[50],str2[50];
	int i,flag = 0;
	
	printf("Enter string\n");
	scanf("%s",str1);
	
	strcpy(str2,str1);
	strrev(str2);
	
	for(i=0;str1[i]!='\0';i++)
	{
		if(str2[i] != str1[i])
		{
		flag = 1;
		break;
		}
	}
	if(flag == 0)
	{
		printf("string is palindrome");
	}
	else
	{
		printf("String is not palindrome");
	}
}
