#include <iostream>
#include <string>
using namespace std;

// -------------------- Employee --------------------
struct Employee
{
protected:
    int eId;
    string name;
    double salary;

public:
    // default constructor
    Employee()
    {
        eId = 106;
        name = "Pritam";
        salary = 25000;
    }

    // parameterized constructor
    Employee(int id, string n, double sal)
    {
        eId = id;
        name = n;
        salary = sal;
    }

    virtual double calSal()
    {
        return salary;
    }

    virtual void display()
    {
        cout << "Id is: " << eId << endl;
        cout << "Name is: " << name << endl;
        cout << "Salary is: " << salary << endl;
        cout << "Final Salary is: " << calSal() << endl;
    }
};

// -------------------- Admin --------------------
struct Admin : public Employee
{
protected:
    double allowances;

public:
    Admin() : Employee()
    {
        allowances = 7500;
    }

    Admin(int id, string n, double sal, double allow)
        : Employee(id, n, sal)
    {
        allowances = allow;
    }

    double calSal()
    {
        return salary + allowances;
    }

    void display()
    {
        Employee::display();
        cout << "Allowances is: " << allowances << endl;
        cout << "Final Salary is: " << calSal() << endl << endl;
    }
};

// -------------------- HR --------------------
struct HR : public Employee
{
protected:
    double commission;

public:
    HR() : Employee()
    {
        commission = 5000;
    }

    HR(int id, string n, double sal, double comm)
        : Employee(id, n, sal)
    {
        commission = comm;
    }

    double calSal()
    {
        return salary + commission;
    }

    void display()
    {
        Employee::display();
        cout << "Commission is: " << commission << endl;
        cout << "Final Salary is: " << calSal() << endl << endl;
    }
};

// -------------------- SalesManager --------------------
struct SalesManager : public Employee
{
protected:
    double incentive;
    double target;

public:
    SalesManager() : Employee()
    {
        incentive = 10000;
        target = 100000;
    }

    SalesManager(int id, string n, double sal, double inc, double tar)
        : Employee(id, n, sal)
    {
        incentive = inc;
        target = tar;
    }

    double calSal()
    {
        return salary + incentive;
    }

    void display()
    {
        Employee::display();
        cout << "Incentive is: " << incentive << endl;
        cout << "Target is: " << target << endl;
        cout << "Final Salary is: " << calSal() << endl << endl;
    }
};

// -------------------- AreaManager --------------------
struct AreaManager : public SalesManager
{
    string areaName;

public:
    AreaManager()
    {
        areaName = "Pune";
    }

    AreaManager(int id, string n, double sal, double inc, double tar, string an)
        : SalesManager(id, n, sal, inc, tar)
    {
        areaName = an;
    }

    void display()
    {
        SalesManager::display();
        cout << "Area name is: " << areaName << endl << endl;
    }
};

// -------------------- EmployeeTest --------------------
int main()
{
    Employee* e1;

    e1 = new Employee(101, "Ram", 30000);
    e1->display();

    e1 = new Admin(102, "Mohan", 30000, 30000);
    e1->display();

    e1 = new SalesManager(103, "Laxman", 30000, 3000, 500000);
    e1->display();

    e1 = new HR(104, "Neha", 30000, 15000);
    e1->display();

    e1 = new AreaManager(105, "Subu", 30000, 3000, 500000, "Mumbai");
    e1->display();
}

