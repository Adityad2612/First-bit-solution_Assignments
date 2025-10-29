#include<stdio.h>
#include<string.h>

char* mystrrchr(char *str,char *ch);
void main()
{
	char str[] = "Aditya";
	char ch = 'i';
	
	mystrrchr(str,ch);
}

char* mystrrchr(char *str,char *ch)
{
	int i, found = 0;
    int len = strlen(str);

	for(i = len - 1; i >= 0; i--) 
	{
		if(str[i] == ch)
		{ 
		    printf("%s", &str[i]);
			found = 1;
			break;  
		}
	}
    if(found == 0)
		printf("Character '%c' not found in string\n", ch);
}
