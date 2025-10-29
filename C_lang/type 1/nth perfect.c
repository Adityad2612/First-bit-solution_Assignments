#include<stdio.h>

void perfect();
void main()
{
	perfect();
}

void perfect()
{
	int n, i, j, sum;

    printf("Enter nth number\n");
    scanf("%d", &n);

    printf("Perfect numbers between 1 and %d are\n", n);

    for (i = 1; i <= n; i++) 
	{
        sum = 0;

        for (j = 1; j <= i/2; j++) 
		{
            if (i % j == 0) 
			{
                sum = sum+ j;
            }
        }
        if (sum == i) 
		{
            printf("%d ", i);
        }
    }
}
