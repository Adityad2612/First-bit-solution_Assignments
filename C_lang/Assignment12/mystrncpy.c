#include<stdio.h>
#include<string.h>

char* mystrncpy(char *dest,char *src,int n);
void main()
{
	char str1[] = "Aditya";
	char str2[30];
	mystrncpy(str2,str1,3);
}
char* mystrncpy(char *dest,char *src,int n)
	{
		int i=0;
		for(i=0;i<n && src[i] !='\0';i++)
		dest[i] = src[i];

        dest[i] = '\0';
        
        printf("Original: %s\n",src);
		printf("After copying: %s",dest);
	}
