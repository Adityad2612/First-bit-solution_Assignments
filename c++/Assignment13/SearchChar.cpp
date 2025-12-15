#include<iostream>
#include<string.h>
using namespace std;

int main()
{
	char str[50],ch;
	int i,flag = 0;
	
	cout << "Enter string\n";
	cin >> str;
	
	cout << "Enter character you want to search\n";
	cin >> ch;
	
	for(i=0;i< strlen(str);i++)
	{
		if(str[i] == ch)
		{
			cout << "Character is found: " << i;
			flag = 1;
		}
	}
	if(flag == 0)
	{
		cout << "Character is not found";
	}
}
