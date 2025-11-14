package lab;

class Shape
{
	String color;
	double area;

	Shape() // default constructor
	{
		this.color = "Red";
		this.area = 20;
	}

	Shape(String color, double area) // parameterized constructor
	{
		this.color = color;
		this.area = area;
	}

	// Getters and setters
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public double getArea() {
		return area;
	}
	public void setArea(double area) {
		this.area = area;
	}
	
	double calArea()
	{
		return area;
	}

	void display() {
		System.out.println("Color: " + this.color);
		System.out.println("Area: " + this.area);
		System.out.println("Area is: "+this.calArea());
	}
} // Shape ends here


class Circle extends Shape
{
	double radius;

	Circle() // default constructor
	{
		super();
		this.radius = 5.0;
		this.area = Math.PI * radius * radius;
	}

	Circle(String color, double radius) // parameterized constructor
	{
		super(color, Math.PI * radius * radius);
		this.radius = radius;
	}

	public double getRadius() {
		return radius;
	}
	public void setRadius(double radius) {
		this.radius = radius;
		this.area = Math.PI * radius * radius;
	}
	
	double calArea()
	{
		return area;
	}

	void display() {
		super.display();
		System.out.println("Radius: " + this.radius);
		System.out.println();
		System.out.println("Area is: "+this.calArea());
	}
} // Circle ends here


class Rectangle extends Shape
{
	double length;
	double breadth;

	Rectangle() // default constructor
	{
		super();
		this.length = 4;
		this.breadth = 9;
		this.area = length * breadth;
	}

	Rectangle(String color, double length, double breadth) // parameterized constructor
	{
		super(color, length * breadth);
		this.length = length;
		this.breadth = breadth;
	}

	public double getLength() {
		return length;
	}
	public void setLength(double length) {
		this.length = length;
		this.area = this.length * this.breadth;
	}
	public double getBreadth() {
		return breadth;
	}
	public void setBreadth(double breadth) {
		this.breadth = breadth;
		this.area = this.length * this.breadth;
	}
	
	double calArea()
	{
		return area;
	}

	void display() {
		super.display();
		System.out.println("Length: " + this.length);
		System.out.println("Breadth: " + this.breadth);
		System.out.println("Area is: "+this.calArea());
		System.out.println();
	}
} // Rectangle ends here


class Triangle extends Shape
{
	double base;
	double height;

	Triangle() // default constructor
	{
		super();
		this.base = 5.0;
		this.height = 4.0;
		this.area = 0.5 * base * height;
	}

	Triangle(String color, double base, double height) // parameterized constructor
	{
		super(color, 0.5 * base * height);
		this.base = base;
		this.height = height;
	}

	public double getBase() {
		return base;
	}
	public void setBase(double base) {
		this.base = base;
		this.area = 0.5 * base * this.height;
	}
	public double getHeight() {
		return height;
	}
	public void setHeight(double height) {
		this.height = height;
		this.area = 0.5 * this.base * height;
	}
	
	double calArea()
	{
		return area;
	}

	void display() {
		super.display();
		System.out.println("Base: " + this.base);
		System.out.println("Height: " + this.height);
		System.out.println("Area is: "+this.calArea());
		System.out.println();
	}
} // Triangle ends here


class ShapeTest
{
	public static void main(String[] args)
	{
		Shape s1;
		System.out.println("\n--- Shape ---");
		 s1 = new Shape();
		 s1 = new Shape("Yellow", 200.0);
		 s1.display();
		 
		 System.out.println("\n--- Circle  ---");
		 s1 = new Circle("Blue", 10.0);
		 s1.display();
		 
		 System.out.println("\n--- Rectangle  ---");
		 s1 = new Rectangle("Green", 8.0, 6.0);
		 s1.display();
		 
		 System.out.println("\n--- Triangle  ---");
		 s1 = new Triangle("Purple", 5.0, 7.0);
		 s1.display();

		
	} //main ends here
} // ShapeTest ends here
