#include<iostream>
using namespace std;

struct HR
{
    int id;
    char name[15];
    int salary;
    int commission;

    void store()
    {
        cout << "Enter id of HR:\n";
        cin >> id;

        cout << "Enter name of HR:\n";
        cin >> name;

        cout << "Enter salary of HR:\n";
        cin >> salary;

        cout << "Enter allowance of HR:\n";
        cin >> commission;
    }

    void display() const
    {
        cout << "Id = " << id << " Name = " << name << " Salary = " << salary << " Allowance = " << commission << endl;
    }
};

int main()
{
    HR h1, h2;

    h1.store();
    h2.store();

    h1.display();
    h2.display();

}

