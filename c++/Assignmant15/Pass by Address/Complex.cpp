#include<iostream>
using namespace std;

struct Complex
{
    int real;
    int imaginary;

    void store()
    {
        cout << "Enter real number\n";
        cin >> real;

        cout << "Enter imaginary number\n";
        cin >> imaginary;
    }

    void display()
    {
        cout << real << " + " << imaginary << " i" << endl;
    }
};

int main()
{
    int n;

    cout << "Enter size of array\n";
    cin >> n;

    Complex c[n];   // array of structures

    // store complex numbers
    for(int i = 0; i < n; i++)
    {
        c[i].store();
    }

    // display complex numbers
    for(int i = 0; i < n; i++)
    {
        c[i].display();
    }

}

