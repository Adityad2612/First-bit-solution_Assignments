#include<iostream>
using namespace std;

int lower();
int main()
{
	int r;
	r =lower();
	if(r == 1)
	cout << "Lower case";
	else if(r == 2)
	cout << "Upper case";
	else
	cout << "Invalid";
}
int lower()
{
	char alpha = 'A';

    if (alpha >= 'a' && alpha <= 'z') 
	{
        return 1;
    }
    else if (alpha >= 'A' && alpha <= 'Z') 
	{
        return 2;
    }
    else 
	{
        return 3;
    }
}
