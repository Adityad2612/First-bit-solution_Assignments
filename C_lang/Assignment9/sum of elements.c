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
	int sum = 0;
	
	printf("\nSum of elements of array is:\n");
	
	for(i=0;i<n;i++)
	{
		sum = sum + arr[i];
	}
	printf("%d",sum);
}
