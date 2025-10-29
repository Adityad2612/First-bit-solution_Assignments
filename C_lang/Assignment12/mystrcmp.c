#include<stdio.h>
#include<string.h>

int mystrcmp(char *str1,char *str2);
void main()
{
	int res;
	char str1[] = "aditya";
	char str2[] = "adi";
	
	res = mystrcmp(str1,str2);
	if(res == 0)
	printf("string is equal");
	else if(res == 1)
	printf("string 1 is greater");
	else 
	printf("string 2 is greater");
}

int mystrcmp(char *str1,char *str2)
{
	int i,j;
	int len1 = strlen(str1);
	int len2 = strlen(str2);
	while(str1[i] != '\0' && str2[j] != '\0')
	{
		for(i=0;i<len1;i++)
		{
			for(j=i;j<len2;j++)
			{
				if(str1[i] == str2[j])
				{
					return 0;
				}
				else if(str1[i] > str2[j])
				{
					return 1;
				}
				else 
				return 2;
			}
		}
	}
}
