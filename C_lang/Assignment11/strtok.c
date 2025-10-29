#include<stdio.h>
#include<string.h>

void main()
{
	char str[] = "Apple,Banana,Grapes";
	char *token = strtok(str,",");
	while(token != '\0')
	{
		printf("%s\n",token);
		token = strtok(NULL,",");
	}
}
