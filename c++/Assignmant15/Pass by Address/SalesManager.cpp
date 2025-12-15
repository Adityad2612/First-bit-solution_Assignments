#include<iostream>
using namespace std;

struct SalesManager
{
    int id;
    char name[15];
    int salary;
    int incentive;
    int target;

    void store()
    {
        cout << "Enter id:\n";
        cin >> id;

        cout << "Enter name:\n";
        cin >> name;

        cout << "Enter salary:\n";
        cin >> salary;

        cout << "Enter incentive:\n";
        cin >> incentive;

        cout << "Enter target:\n";
        cin >> target;
    }

    void display() const
    {
        cout << "Id = " << id << ", Name = " << name << ", Salary = " << salary << ", Incentive = " << incentive << ", Target = " << target;
    }
};

int main()
{
    int n;
    cout << "Enter size of array\n";
    cin >> n;

    SalesManager sm[n];

    for(int i = 0; i < n; i++)
    {
        sm[i].store();
    }

    for(int i = 0; i < n; i++)
    {
        sm[i].display();
    }

    return 0;
}

