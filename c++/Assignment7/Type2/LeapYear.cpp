#include<iostream>
using namespace std;

int leapyear();
int main()
{
	int r;
	r =leapyear();
	if(r == 1)
	cout << "Leap year";
	else
	cout << "Not leap year";
}
int leapyear()
{
	int year = 2025;
	if(year % 4 == 0)
	{
	return 1;
    }
    else
    {
    return 2;
	}
}
