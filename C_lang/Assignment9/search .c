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
	int num,flag=0;
	printf("\nEnter number you want to search\n");
	scanf("%d",&num);
	
	for(i=0;i<n;i++)
	{
		if(arr[i] == num)
		{
			printf("%d ",i);
			flag = 1;
		}
	}
	if(flag == 0)
	{
		printf("Number is not present");
	}
}
