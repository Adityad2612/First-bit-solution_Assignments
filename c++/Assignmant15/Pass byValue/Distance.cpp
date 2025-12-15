#include<iostream>
using namespace std;

struct Distance
{
    int feet;
    int inch;

    void store()
    {
        cout << "Enter feet\n";
        cin >> feet;

        cout << "Enter inch\n";
        cin >> inch;
    }

    void display() 
    {
        cout << "feet = " << feet << " inch = " << inch << endl;
    }
};

int main()
{
    Distance d1, d2;

    d1.store();
    d2.store();

    d1.display();
    d2.display();

}

