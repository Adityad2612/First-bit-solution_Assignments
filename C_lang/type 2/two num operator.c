#include<stdio.h>

int op();
void main()
{
	int r;
	r =op();
	printf("%d",r);
}
int op()
{
	int num1,num2,r1;
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
		return r1;
	}
	else if(op == '*')
	{
		r1 = num1 * num2;
		return r1;
	}
	else if(op == '-')
	{
		r1 = num1 - num2;
		return r1;
	}
    else if (op == '/') 
	{
        if (num2 != 0) 
		{
            r1 = num1 / num2;
            return r1;
        } 
		else 
		{
            return r1;
        }
    }
    else 
	{
        return r1;
    }
}
