//multilevel inheritance
// Base class
class Shape
{
    public void printShape()
    {
        System.out.println("This is a shape.");
    }
}

// Intermediate class
class Rectangle extends Shape
{
    public void printRectangle()

    {
        System.out.println("This is a rectangle.");
    }
}

// Derived class
public class Box extends Rectangle
{
    public void printBox()
    {
        System.out.println("This is a box.");
    }

    public static void main(String[] args)

    {
        // Creating object of the most derived class
        Box b = new Box();

        // Calling all inherited and own methods
        b.printShape();
        b.printRectangle();
        b.printBox();
    }
}
