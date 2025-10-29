#include<stdio.h>
#include<string.h>

void main()
{
	char str[50];
	int i;
	
	printf("Enter a string\n");
	scanf("%s",str);
	
	for(i=0;i< strlen(str);i++)
	{
		if(str[i] == 'a')
		{
			str[i] = '$';
		}
	}
	for(i=0;i<strlen(str);i++)
	{
		printf("%c",str[i]);
	}
}
