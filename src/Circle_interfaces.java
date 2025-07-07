// Interface
interface Shape1 {
    void draw(); // abstract method
}

// Implementing class
class Circle implements Shape1
{
    public void draw()
    {
        System.out.println("Drawing a Circle");
    }
}

// Another implementing class
class Square implements Shape1
{
    public void draw()
    {
        System.out.println("Drawing a Square");
    }
}

public class Circle_interfaces
{
    public static void main(String[] args)
    {
        Shape1 s1 = new Circle();
        Shape1 s2 = new Square();

        s1.draw();
        s2.draw();
    }
}
