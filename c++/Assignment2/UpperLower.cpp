#include<iostream>
using namespace std;

int main()
{
	char ch;
	cout << "Enter character\n";
	cin >> ch;
	if(ch >= 'a' && ch <= 'z')
	{
		cout << "Lower alphabet";
	}
	else
	{
		cout << "Upper alphabet";
	}
}
