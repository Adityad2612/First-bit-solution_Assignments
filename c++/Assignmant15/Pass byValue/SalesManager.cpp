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
        cout << "Enter id of sales manager:\n";
        cin >> id;

        cout << "Enter name of sales manager:\n";
        cin >> name;

        cout << "Enter salary of sales manager:\n";
        cin >> salary;

        cout << "Enter incentive of sales manager:\n";
        cin >> incentive;

        cout << "Enter target of sales manager:\n";
        cin >> target;
    }

    void display() const
    {
        cout << "Id = " << id << " Name = " << name << " Salary = " << salary << " Incentive = " << incentive 
		<< " Target = " << target << endl;
    }
};

int main()
{
    SalesManager sm1, sm2;

    sm1.store();
    sm2.store();

    sm1.display();
    sm2.display();

}

