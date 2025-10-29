#include<stdio.h>
#include<string.h>

int mystrncasecmp(char *str1,char *str2,int n);
void main()
{
	int res;
	char str1[] = "he";
	char str2[] = "HELLO";
	int n=4;
	res = mystrncasecmp(str1,str2,n);
	if(res == 0)
	printf("string is equal");
	else if(res == 1)
	printf("string 1 is greater");
	else 
	printf("string 2 is greater");
}

int mystrncasecmp(char *str1,char *str2,int n)
{
	int i = 0;
	
	while(i < n && (str1[i] != '\0' && str2[i] != '\0'))
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
