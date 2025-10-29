#include <stdio.h>

void strong();
void main() 
{
    strong();
}

void strong()
{
	int n, i,j, temp, digit, sum, fact;

    printf("Enter nth number\n");
    scanf("%d", &n);

    printf("Strong numbers between 1 and %d are\n", n);

    for (i = 1; i <= n; i++) 
	{
        temp = i;
        sum = 0;

        while (temp > 0) 
		{
            digit = temp % 10;

            fact = 1;
            for (j = 1; j <= digit; j++) 
			{
                fact = fact * j;
            }

            sum = sum + fact;
            temp = temp / 10;
        }

        if (sum == i) 
		{
            printf("%d ", i);
        }
    }
}

