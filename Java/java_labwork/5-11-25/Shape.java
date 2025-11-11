class Shape 
{
	double Area(double base, double height) 
	{
        	return 0.5 * base * height;
    	}

    	int Area(int length, int breadth) 
	{
        	return length * breadth;
    	}

    	double Area(double radius) 
	{
        	return 3.14 * radius * radius;
    	}
} // class Shape ends here

class Triangle 
{
    	double base, height;

    	Triangle(double base, double height) 
	{
        	this.base = base;
        	this.height = height;
    	}
}

class Rectangle 
{
    	int length, breadth;

    	Rectangle(int length, int breadth) 
	{
        	this.length = length;
        	this.breadth = breadth;
    	}
}

class Circle 
{
    	double radius;

    	Circle(double radius) 
	{
        	this.radius = radius;
    	}
}

class Test 
{
    public static void main(String[] args) 
	{
    
        Triangle t1 = new Triangle(5, 8);
        Rectangle r1 = new Rectangle(4, 6);
        Circle c1 = new Circle(3);
        Shape s1 = new Shape();

        System.out.println("Area of Triangle: " + s1.Area(t1.base, t1.height));
        System.out.println("Area of Rectangle: " + s1.Area(r1.length, r1.breadth));
        System.out.println("Area of Circle: " + s1.Area(c1.radius));
    } //main ends here
} // Test class ends here
