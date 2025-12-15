#include<iostream>
using namespace std;

void vowel();
int main()
{
	vowel();
}
void vowel()
{
	char vowel;
	vowel = 'z';
	if(vowel == 'a' || vowel == 'e' || vowel == 'i' || vowel == 'o' || vowel == 'u')
	{
	printf("Vowel");
    }
    else
    {
    printf("Consonant");
	}
}
