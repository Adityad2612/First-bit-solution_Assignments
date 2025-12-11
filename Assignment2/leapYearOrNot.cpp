#include<iostream>
using namespace std;

int main()
{
	int year;
	cout << "Enyer year\n";
	cin >> year;
	if(year % 4 == 0)
	{
	printf("leap year");
    }
    else
    {
    	printf("Not leap year");
	}
}
