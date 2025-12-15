#include<iostream>
#include<string.h>
using namespace std;

int main()
{
	char str[50],ch;
	int i,count = 0,len;
	
	cout << "Enter string\n";
	cin >> str;
	len = strlen(str);
	for(i=0;i<len;i++)
	{
		if(str[i] == 'a' || str[i] == 'e' || str[i] == 'i' || str[i] == 'o' || str[i] == 'u')
		{
			count++;
		}
	}
	cout << "Number of vowels are: " << count;
}
