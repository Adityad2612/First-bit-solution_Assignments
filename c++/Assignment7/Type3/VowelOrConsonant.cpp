#include<iostream>
using namespace std;

char conso(char);
int main()
{
	char vowel;
	
	cout << "Enter an alphabet\n";
	cin >> vowel;
	
	conso(vowel);
}
char conso(char vowel)
{
	if(vowel == 'a' || vowel == 'e' || vowel == 'i' || vowel == 'o' || vowel == 'u')
	{
	cout << "Vowel";
    }
    else
    {
    cout << "Consonant";
	}
}
