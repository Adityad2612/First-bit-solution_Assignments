#include<iostream>
using namespace std;

int main()
{
	int age;
	
	cout << "Enter age\n";
	cin >> age;
	
	if(age < 12)
	{
		cout << "Child";
	}
	else if(age >= 12 && age <=19)
	{
		cout << "Teeneger";
	}
	else if(age >= 20 && age <= 59)
	{
		cout << "Adult";
	}
	else if(age >60)
	{
		cout << "Senior citizen";
	}
}
