#include<iostream>
#include<string.h>
using namespace std;

int main()
{
	char str[50];
	int index;
	int i;
	
	cout << "Enter string\n";
	cin >> str;
	
	cout << "Enter index you want to delete\n";
	cin >> index;
	for(i = index;i<strlen(str);i++)
	{
		str[i] = str[i+1];
	}
	cout << "String after deleting: " << str;
}
