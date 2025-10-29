#include<stdio.h>
#include<string.h>

void main()
{
	char str[50],ch;
	int i,flag = 0;
	
	printf("Enter a string\n");
	scanf("%s",str);
	
	printf("Enter character you want to search\n");
	scanf(" %c",&ch);
	
	for(i=0;i< strlen(str);i++)
	{
		if(str[i] == ch)
		{
			printf("Character is found %d",i);
			flag = 1;
		}
	}
	if(flag == 0)
	{
		printf("Character is not found");
	}
}
