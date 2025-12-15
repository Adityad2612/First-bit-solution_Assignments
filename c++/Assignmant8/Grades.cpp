#include<iostream>
using namespace std;

int grade(int *marks);
int main()
{
	int marks;
	
	cout << "Enter marks\n";
	cin >> marks;
	
	grade(&marks);
}
int grade(int *marks)
{
	if(*marks > 75 && *marks <=100)
	{
		cout << "Distinction";
	}
	else if(*marks >65 && *marks <=75)
	{
		cout << "First class";
	}
	else if(*marks >55 && *marks <=65)
	{
		cout << "Second class";
	}
	else if(*marks > 40 && *marks <=55)
	{
		cout << "Pass class";
	}
	else if(*marks <=40)
	{
		cout << "Fail";
	}
	else
	{
		cout << "Marks invalid";
	}
}
