#include<stdio.h>
#include<string.h>

char* mystrchr(char *str,char *ch);
void main()
{
	char str[] = "Aditya";
	char ch = 'i';
	
	mystrchr(str,ch);
}

char* mystrchr(char *str,char *ch)
{
	int i, found = 0;

	for(i = 0; str[i] != '\0'; i++)
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
