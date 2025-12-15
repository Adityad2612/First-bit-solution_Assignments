#include<iostream>
using namespace std;

struct Time
{
	int hours;
	int minutes;
	int seconds;

void store()
    {
        cout << "Enter hours\n";
        cin >> hours;

        cout << "Enter minutes\n";
        cin >> minutes;

        cout << "Enter seconds\n";
        cin >> seconds;
    }
    
    void display() const
    {
        cout << "hours = " << hours<< " minutes = " << minutes << " seconds = " << seconds << endl;
    }
};

int main()
{
	Time t1,t2;
   t1.store();
   t2.store();

    t1.display();
    t2.display();

}
