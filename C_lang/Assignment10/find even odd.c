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
	evenodd(arr,n);
}

evenodd(int arr[],int n)
{
	int i,j;
	printf("\nEven numbers are:\n");
	for(i=0;i<n;i++)
	{
		if(arr[i] % 2 == 0)
		{
			printf("%d ",arr[i]);
		}
	}
	printf("\nOdd numbers are:\n");
	for(j=0;j<n;j++)
	{
		if(arr[j] % 2 != 0)
		{
			printf("%d ",arr[j]);
		}
	}
}
