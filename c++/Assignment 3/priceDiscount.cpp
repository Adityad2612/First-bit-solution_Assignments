#include<iostream>
using namespace std;

int main()
{
	int price;
	int discount;
	char student = '1';
	
	
	cout << "Enter price\n";
	cin >> price;
	
	cout << "Enter whether you are student or not\n";
	cin >> student;
	
	if(student == '1')
	{
		if(price > 500)
		{
			discount = price*0.2;
			cout << "Discount is: " << discount;
		}
		else
		{
			discount = price *0.1;
			cout << "Discount is: " << discount;
		}
	}
	else
	{
			if(price > 600)
			{
				discount = price*0.15;
				cout << "Discount is: " << discount;
			}
			else
			{
				cout << "There is no discount";
			}
	}
	
}
