#include<iostream>
using namespace std;

void upper();
int main()
{
	upper();
}
void upper()
{
	char ch = 'C';
	if(ch >= 'a' && ch <= 'z')
	{
		cout << "Lower alphabet";
	}
	else
	{
		cout << "Upper alphabet";
	}
}
