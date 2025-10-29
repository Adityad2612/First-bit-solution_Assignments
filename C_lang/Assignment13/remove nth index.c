#include<stdio.h>
#include<string.h>

void main()
{
	char str[50];
	int index;
	int i;
	
	printf("Enter a string\n");
	scanf("%s",str);
	
	printf("Enter index you want to delete");
	scanf("%d",&index);
	for(i = index;i<strlen(str);i++)
	{
		str[i] = str[i+1];
	}
	printf("string after deleteing %s\n",str);
}
