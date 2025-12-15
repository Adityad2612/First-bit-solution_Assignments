#include<iostream>
using namespace std;

int dis(int,int,char);
int main()
{
	int price,discount,r;
	char student = '1';
	cout << "Enter price\n";
	cin >> price;
	
	fflush(stdin);
	
	cout << "Enter whether you are student or not\n";
	cin >> student;
	
	r =dis(price,discount,student);
	cout << "Discount is: " << r;
	if(r==1)
	cout << "No discount";
}
int dis(int price, int discount, char student)
{
	if(student == '1')
	{
		if(price > 500)
		{
			discount = price*0.2;
			return discount;
		}
		else
		{
			discount = price *0.1;
			return discount;
		}
	}
	else
	{
			if(price > 600)
			{
				discount = price*0.15;
				return discount;
			}
			else
			{
				return 1;
			}
	}
}
