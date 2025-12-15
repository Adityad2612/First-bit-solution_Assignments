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
		printf("%d ",arr[i]);
	}
	int flag,j;
	cout << "\nPrime number in array:\n";
	for(i=0;i<n;i++)
	{
		flag = 0;
	for(j=2;j<n;j++)
	{
		if(arr[i]%j == 0)
		{
			flag = 1;
			break;
		}
	}
	if(flag == 0)
	{
		cout << " " << arr[i];
	}
}
}
