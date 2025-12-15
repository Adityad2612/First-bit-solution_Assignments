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
        cout << "feet = " << feet << " and inch = " << inch << endl;
    }
};

int main()
{
    int n;

    cout << "Enter size of array\n";
    cin >> n;

    Distance d[n];   // array of structures

    // store distance values
    for(int i = 0; i < n; i++)
    {
        d[i].store();
    }

    // display distance values
    for(int i = 0; i < n; i++)
    {
        d[i].display();
    }

}

