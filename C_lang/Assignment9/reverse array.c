#include<stdio.h>

void main()
{
	int n,i;
	
	printf("Enter size of array\n");
	scanf("%d",&n);
	int arr[n];
	
	printf("Enter elements in array\n");
	for(i=0;i<n;i++)
	{
		scanf("%d",&arr[i]);
	}
	printf("\nElements in array\n");
	for(i=0;i<n;i++)
	{
		printf("%d ",arr[i]);
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
	printf("\nReversed array\n");
	for(i=0;i<n;i++)
	{
		printf("%d ",arr[i]);
	}
}
