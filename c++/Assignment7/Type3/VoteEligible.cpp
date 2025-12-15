#include<iostream>
using namespace std;

void age(int);
int main()
{
	int person_age;
	
	cout << "Enter age\n";
	cin >> person_age;
	
	age(person_age);
}
void age(int person_age)
{
	if(person_age >= 18)
	{
		cout << "Eligible for vote";
	}
	else
	{
		cout << "Not eligible for vote";
	}
}
