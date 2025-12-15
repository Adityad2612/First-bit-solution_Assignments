#include<iostream>
using namespace std;

char lower(char);
int main()
{
	char alpha;
	
	cout << "Enter alphabet\n";
	cin >> alpha;
	
	lower(alpha);
}
char lower(char alpha)
{
	if (alpha >= 'a' && alpha <= 'z') 
	{
        cout << "Lowercase";
    }
    else if (alpha >= 'A' && alpha <= 'Z') 
	{
        cout << "Uppercase";
    }
    else 
	{
        cout << "Not an alphabet";
    }
}
