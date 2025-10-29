#include<stdio.h>
#include<string.h>

char* mystrcpy(char *dest,char *src);
void main()
{
	char str1[] = "Aditya";
	char str2[30];
	mystrcpy(str2,str1);
}
char* mystrcpy(char *dest,char *src)
	{
		int i=0;
		while(src[i] != '\0')
		{
			dest[i] = src[i];
			i++;
		}
		dest[i] = '\0';
		printf("Original: %s\n",src);
		printf("After copying: %s",dest);
	}
