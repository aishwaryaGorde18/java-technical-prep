// Parent class
class Animal2
{
    void eat() {
        System.out.println("Animal is eating...");
    }
}

// Child class inheriting from Animal
class Dog2 extends Animal2 {
    void bark() {
        System.out.println("Dog is barking...");
    }
}

// Main class to test
public class inheritance_single
{
    public static void main(String[] args)
    {
        Dog2 d = new Dog2();
        d.eat();   // Inherited method from Animal
        d.bark();  // Own method of Dog
    }
}

