#include<iostream>
using namespace std;

int main()
{
	int n,i;
	
	cout << "Enter size of array\n";
	cin >> n;
	int arr[n];
	
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
	cout << "\nAlternate elements are\n";
	for(i=0;i<n;i++)
	{
	    if(i%2 !=0)
	    {
	    	cout << " " << arr[i];
		}
	}
}
