#include<iostream>
using namespace std;

struct Product
{
    int id;
    char name[15];
    int quantity;
    int price;

    void store()
    {
        cout << "Enter id\n";
        cin >> id;

        cout << "Enter name\n";
        cin >> name;

        cout << "Enter quantity\n";
        cin >> quantity;

        cout << "Enter price\n";
        cin >> price;
    }

    void display() 
    {
        cout << "id = " << id << " name = " << name << " quantity = " << quantity << " price = " << price << endl;
    }
};

int main()
{
    Product p1, p2;

    p1.store();
    p2.store();

    p1.display();
    p2.display();

}

