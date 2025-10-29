#include<stdio.h>

int ope(int,int,int,char);
void main()
{
	int num1,num2,r1,r;
	char op;
	printf("Enter first number\n");
	scanf("%d", &num1);
	
	printf("Enter second number\n");
	scanf("%d", &num2);

	printf("Enter Operator\n");
	scanf(" %c", &op);
	
	r =ope(num1,num2,r1,op);
	printf("%d", r);
	
	if(r == 1)
	printf("Can not be divided by zero");
	else
	printf("Invalid input");
}
int ope(int num1, int num2, int r1, char op)
{
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
            return 1;
        }
    }
    else 
	{
        return 2;
    }
}
