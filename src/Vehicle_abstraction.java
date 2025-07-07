
abstract class Vehicle
{
    // Abstract method
    abstract void start();
}
// Subclass
class Car1 extends Vehicle
{
    // Implement abstract method
    void start() {
        System.out.println("Car is starting...");
    }
}
public class Vehicle_abstraction
{
    public static void main(String[] args)
    {
        Car1 myCar = new Car1();
        myCar.start();
    }
}