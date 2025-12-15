#include<iostream>
using namespace std;

void leapyear();
int main()
{
	leapyear();
}
void leapyear()
{
    int year = 2025;
	if(year % 4 == 0)
	{
		cout << "Leap year";
    }
    else
    {
    	cout << "Not leap year";
	}
}
