#include<iostream>
using namespace std;

int main()
{
	int n,i;
	
	cout << "Enter size of array\n";
	cin >> n;
	int *arr = new int[n];
	
	cout << "Enter elements in array\n";
	for(i=0;i<n;i++)
	{
		cin >> arr[i];
	}
	cout << "\nElements in array\n";
	for(i=0;i<n;i++)
	{
		cout << " " << arr[i];
	}
	int min = arr[0],max = arr[0];
	for(i=1;i<n;i++)
	{
		if(arr[i] < min)
		min = arr[i];
		if(arr[i] > max)
		max = arr[i];
	}
	cout << "\nMinimum number is: " << min;
	cout << "\nMaximum number is: " << max;
}
