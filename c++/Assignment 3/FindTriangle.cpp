#include<iostream>
using namespace std;

int main()
{
	int s1; int s2; int s3;
	cout << "Enter first side\n";
	cin >> s1;
	
	cout << "Enter second side\n";
	cin >> s2;
	
	cout << "Enter third side\n";
	cin >> s3;
	
	if(s1 == s2 && s2 == s3 && s1 == s3)
	{
		cout << "Equilateral Triangle";
	}
	else if(s1 == s2 ||s2 == s3 || s1 == s3)
	{
		cout << "isosceles Triangle";
	}
	else if(s1 != s2 ||s2 != s3 || s1 != s3)
	{
		cout << "Scalene Triangle";
	}
	else
	{
		cout << "Invalid input";
	}
}
