#include <iostream>
#include <string>
using namespace std;

// -------------------- Appliance --------------------
struct Appliance
{
protected:
    string brand;
    double price;
    int powerRating;

public:
    // default constructor
    Appliance()
    {
        brand = "Samsung";
        price = 25000;
        powerRating = 1200;
    }

    // parameterized constructor
    Appliance(string b, double p, int pr)
    {
        brand = b;
        price = p;
        powerRating = pr;
    }

    virtual void start()
    {
        cout << "Appliance started!" << endl;
    }

    virtual void display()
    {
        cout << "Brand: " << brand << endl;
        cout << "Price: " << price << endl;
        cout << "Power Rating: " << powerRating << "W" << endl;
    }
};

// -------------------- WashingMachine --------------------
struct WashingMachine : public Appliance
{
protected:
    int drumSize;

public:
    WashingMachine() : Appliance()
    {
        drumSize = 7;
    }

    WashingMachine(string b, double p, int pr, int d)
        : Appliance(b, p, pr)
    {
        drumSize = d;
    }

    void start()
    {
        cout << "Washing machine started intakeing water" << endl;
    }

    void display()
    {
        Appliance::display();
        cout << "Drum Size: " << drumSize << "kg" << endl << endl;
    }
};

// -------------------- Refrigerator --------------------
struct Refrigerator : public Appliance
{
protected:
    int capacity;

public:
    Refrigerator() : Appliance()
    {
        capacity = 300;
    }

    Refrigerator(string b, double p, int pr, int c)
        : Appliance(b, p, pr)
    {
        capacity = c;
    }

    void start()
    {
        cout << "Refrigerator started cooling!" << endl;
    }

    void display()
    {
        Appliance::display();
        cout << "Capacity: " << capacity << "L" << endl << endl;
    }
};

// -------------------- Microwave --------------------
struct Microwave : public Appliance
{
protected:
    int volume;

public:
    Microwave() : Appliance()
    {
        volume = 25;
    }

    Microwave(string b, double p, int pr, int v)
        : Appliance(b, p, pr)
    {
        volume = v;
    }

    void start()
    {
        cout << "Microwave started heating food!" << endl;
    }

    void display()
    {
        Appliance::display();
        cout << "Volume: " << volume << "L" << endl << endl;
    }
};

// -------------------- ApplianceTest --------------------
int main()
{
    Appliance* a1;

    cout << "--- Appliance ---" << endl;
    a1 = new Appliance("LG", 18000, 1000);
    a1->display();
    a1->start();

    cout << "\n--- WashingMachine ---" << endl;
    a1 = new WashingMachine("Whirlpool", 32000, 1500, 8);
    a1->display();
    a1->start();

    cout << "\n--- Refrigerator ---" << endl;
    a1 = new Refrigerator("Godrej", 40000, 1300, 350);
    a1->display();
    a1->start();

    cout << "\n--- Microwave ---" << endl;
    a1 = new Microwave("Panasonic", 15000, 800, 30);
    a1->display();
    a1->start();
}

