#include<iostream>
using namespace std;

int main()
{
	int n,i;
	
	cout << "Enter size of array\n";
	cin >> n;
	int arr[n];
	
	cout << "Elements in array\n";
	for(i=0;i<n;i++)
	{
		cin >> arr[i];
	}
	cout << "\nElements in array\n";
	for(i=0;i<n;i++)
	{
		cout << " " << arr[i];
	}
	int num,flag=0;
	cout << "\nEnter number you want to search\n";
	cin >> num;
	
	for(i=0;i<n;i++)
	{
		if(arr[i] == num)
		{
			cout << "Number is found at index: " << i;
			flag = 1;
		}
	}
	if(flag == 0)
	{
		cout << "Number is not present";
	}
}
