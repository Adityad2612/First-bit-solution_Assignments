#include<iostream>
using namespace std;

int main()
{
	int num1; int num2;int r1;
	char op;
	cout << "Enter first number\n";
	cin >> num1;
	
	cout << "Enter secong number\n";
	cin >> num2;

	cout << "Enter operator\n";
	cin >> op;
	if(op == '+')
	{
		r1 = num1 + num2;
		cout << "Addition is: " << r1;
	}
	else if(op == '*')
	{
		r1 = num1 * num2;
		cout << "Multiplication is: " << r1;
	}
	else if(op == '-')
	{
		r1 = num1 - num2;
		cout << "Subtraction is: " << r1;
	}
    else if (op == '/') 
	{
        if (num2 != 0) 
		{
            r1 = num1 / num2;
            cout << "Division is: " << r1;
        } 
		else 
		{
            cout << "Can not be divided by zero";
        }
    }
    else 
	{
        cout << "Invalid operator";
    }
}
