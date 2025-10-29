#include<stdio.h>
#include<string.h>

void main()
{
	char str[50],ch;
	int i,len;
	
	printf("Enter a string\n");
	scanf("%[^\n]",str);
	len = strlen(str);
	
	for(i = 0;i<len;i++)
	{
		if(str[i] == ' ')
		{
			str[i] = '#';
		}
	}
	printf("Replacing every blank space %s",str);
}
