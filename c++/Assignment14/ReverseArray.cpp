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
	int start=0,end=n-1,temp;
	while(start < end)
	{
		temp = arr[start];
		arr[start] = arr[end];
		arr[end] = temp;
		
		start++;
		end--;
	}
	cout << "\nReversed array\n";
	for(i=0;i<n;i++)
	{
		cout << " " << arr[i];
	}
}
