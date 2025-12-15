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
    Complex c1, c2;

    c1.store();
    c2.store();

    c1.display();
    c2.display();

}

