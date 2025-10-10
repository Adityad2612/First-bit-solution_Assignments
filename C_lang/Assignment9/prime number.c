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
	int flag,j;
	printf("\nPrime numbers in array:\n");
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
		printf("%d ",arr[i]);
	}
}
}
