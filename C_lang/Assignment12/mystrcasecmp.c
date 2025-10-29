#include<stdio.h>
#include<string.h>

int mystrcasecmp(char *str1,char *str2);
void main()
{
	int res;
	char str1[] = "hello";
	char str2[] = "HELLO";
	
	res = mystrcasecmp(str1,str2);
	if(res == 0)
	printf("string is equal");
	else if(res == 1)
	printf("string 1 is greater");
	else 
	printf("string 2 is greater");
}

int mystrcasecmp(char *str1,char *str2)
{
	int i = 0;
	
	while(str1[i] != '\0' && str2[i] != '\0')
	{
		char c1 = tolower(str1[i]);
		char c2 = tolower(str2[i]);
		
		if(c1 > c2)
			return 1;
		else if(c1 < c2)
			return 2;
		
		i++;
	}
	
	if(str1[i] == '\0' && str2[i] == '\0')
		return 0;
	else if(str1[i] != '\0')
		return 1; 
	else
		return 2;
}
