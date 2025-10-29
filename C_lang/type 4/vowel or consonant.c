#include<stdio.h>

char conso(char);
void main()
{
	int r;
	char vowel;
	
	printf("Enter a alphabet\n");
	scanf("%c", &vowel);
	
	r =conso(vowel);
	if(r == 1)
	printf("Vowel");
	else
	printf("Consonant");
}
char conso(char vowel)
{
	if(vowel == 'a' || vowel == 'e' || vowel == 'i' || vowel == 'o' || vowel == 'u')
	{
	return 1;
    }
    else
    {
    return 2;
	}
}
