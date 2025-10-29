#include<stdio.h>

void op();
void main()
{
	op();
}
void op()
{
	int num1; int num2;int r1;
	char op;
	printf("Enter first number");
	scanf("%d", &num1);
	
	printf("Enter second number");
	scanf("%d", &num2);

	printf("Enter Operator");
	scanf(" %c", &op);
	if(op == '+')
	{
		r1 = num1 + num2;
		printf("%d", r1);
	}
	else if(op == '*')
	{
		r1 = num1 * num2;
		printf("%d", r1);
	}
	else if(op == '-')
	{
		r1 = num1 - num2;
		printf("%d", r1);
	}
    else if (op == '/') 
	{
        if (num2 != 0) 
		{
            r1 = num1 / num2;
            printf("%d", r1);
        } 
		else 
		{
            printf("can not be divided by zero");
        }
    }
    else 
	{
        printf("Invalid operator!\n");
    }
}
