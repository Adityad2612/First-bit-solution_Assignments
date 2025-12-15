#include<iostream>
using namespace std;

int vowel();
int main()
{
	int r;
	r =vowel();
	
	if(r == 1)
	cout << "Vowel";
	else
	cout << "Consonant";
}
int vowel()
{
	char vowel;
	vowel = 'z';
	if(vowel == 'a' || vowel == 'e' || vowel == 'i' || vowel == 'o' || vowel == 'u')
	{
	return 1;
    }
    else
    {
    return 2;
	}
}
