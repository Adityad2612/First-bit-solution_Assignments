#include<iostream>
using namespace std;

int main()
{
	int person_age;
	cout << "Enter person age\n";
	cin >> person_age;
	if(person_age >= 18)
	{
		cout << "Eligible for vote";
	}
	else
	{
		cout << "Not eligible for vote";
	}
}
