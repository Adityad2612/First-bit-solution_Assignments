#include <iostream>
#include <string>
#include <cmath>
using namespace std;

// -------------------- Shape --------------------
struct Shape
{
protected:
    string color;
    double area;

public:
    // default constructor
    Shape()
    {
        color = "Red";
        area = 20;
    }

    // parameterized constructor
    Shape(string c, double a)
    {
        color = c;
        area = a;
    }

    virtual double calArea()
    {
        return area;
    }

    virtual void display()
    {
        cout << "Color: " << color << endl;
        cout << "Area: " << area << endl;
        cout << "Area is: " << calArea() << endl;
    }
};

// -------------------- Circle --------------------
struct Circle : public Shape
{
protected:
    double radius;

public:
    Circle() : Shape()
    {
        radius = 5.0;
        area = M_PI * radius * radius;
    }

    Circle(string c, double r)
        : Shape(c, M_PI * r * r)
    {
        radius = r;
    }

    double calArea()
    {
        return area;
    }

    void display()
    {
        Shape::display();
        cout << "Radius: " << radius << endl;
        cout << "Area is: " << calArea() << endl << endl;
    }
};

// -------------------- Rectangle --------------------
struct Rectangle : public Shape
{
protected:
    double length;
    double breadth;

public:
    Rectangle() : Shape()
    {
        length = 4;
        breadth = 9;
        area = length * breadth;
    }

    Rectangle(string c, double l, double b)
        : Shape(c, l * b)
    {
        length = l;
        breadth = b;
    }

    double calArea()
    {
        return area;
    }

    void display()
    {
        Shape::display();
        cout << "Length: " << length << endl;
        cout << "Breadth: " << breadth << endl;
        cout << "Area is: " << calArea() << endl << endl;
    }
};

// -------------------- Triangle --------------------
struct Triangle : public Shape
{
protected:
    double base;
    double height;

public:
    Triangle() : Shape()
    {
        base = 5.0;
        height = 4.0;
        area = 0.5 * base * height;
    }

    Triangle(string c, double b, double h)
        : Shape(c, 0.5 * b * h)
    {
        base = b;
        height = h;
    }

    double calArea()
    {
        return area;
    }

    void display()
    {
        Shape::display();
        cout << "Base: " << base << endl;
        cout << "Height: " << height << endl;
        cout << "Area is: " << calArea() << endl << endl;
    }
};

// -------------------- ShapeTest --------------------
int main()
{
    Shape* s1;

    cout << "\n--- Shape ---" << endl;
    s1 = new Shape("Yellow", 200.0);
    s1->display();

    cout << "\n--- Circle ---" << endl;
    s1 = new Circle("Blue", 10.0);
    s1->display();

    cout << "\n--- Rectangle ---" << endl;
    s1 = new Rectangle("Green", 8.0, 6.0);
    s1->display();

    cout << "\n--- Triangle ---" << endl;
    s1 = new Triangle("Purple", 5.0, 7.0);
    s1->display();
}

