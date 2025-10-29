#include<stdio.h>
#include<string.h>

int mystrncmp(char *str1,char *str2,int n);
void main()
{
	char str1[] = "Aditya";
	char str2[] = "aditya";
	int n=4;
	mystrncmp(str1,str2,n);
}

int mystrncmp(char *str1,char *str2,int n)
{
	int i,flag = 0;
	
	for(i=0;i<n && (str1[i] !='\0' || str2[i] !='\0');i++)
	{
		if(str1[i] != str2[i])
		{
			flag = 1;
			break;
		}
	}

    if (flag == 0)
        printf("string is equal\n", n);
    else if (str1[i] > str2[i])
        printf("String 1 is greater\n");
    else
        printf("String 2 is greater\n");
}
