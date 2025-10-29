#include<stdio.h>

char conso(char);
void main()
{
	char vowel;
	
	printf("Enter a alphabet\n");
	scanf("%c", &vowel);
	
	conso(vowel);
}
char conso(char vowel)
{
	if(vowel == 'a' || vowel == 'e' || vowel == 'i' || vowel == 'o' || vowel == 'u')
	{
	printf("Vowel");
    }
    else
    {
    printf("Consonant");
	}
}
