#include<stdio.h>
#include<string.h>

void main()
{
	char str[50],ch;
	int i,count = 0,len;
	
	printf("Enter a string\n");
	scanf("%s",str);
	len = strlen(str);
	for(i=0;i<len;i++)
	{
		if(str[i] == 'a' || str[i] == 'e' || str[i] == 'i' || str[i] == 'o' || str[i] == 'u')
		{
			count++;
		}
	}
	printf("Number of vowels  are %d",count);
}
