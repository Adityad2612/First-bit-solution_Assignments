#include<iostream>
using namespace std;

int main()
{
	int i,j,n,flag;
	int sum = 0;
	
	cout << "Enter nth number\n";
	cin >> n;
	
	cout << "Prime numbers between 1 to " << n << " are\n";

	for(i = 2; i<n;i++)
	{
		flag = 0;    //prime
		
		for (j = 2; j < i; j++) 
		{
            if (i % j == 0) 
			{  
                flag = 1;    //not prime
                break;
            }
        }
        if(flag == 0)
	    {
		cout << "\n" << i;
	    }
	}
}
