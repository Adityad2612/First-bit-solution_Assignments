#include<iostream>
using namespace std;

int main() {
    int n, i, j, sum;

    cout << "Enter nth number\n";
    cin >> n;

	cout << "perfect numbers between 1 and " << n << " are\n";

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
            cout << "\n" << i;
        }
    }
}

