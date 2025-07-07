class Animal
{
    void sound()
    {
        System.out.println("Animal makes a sound");
    }
}

class Dog extends Animal
{
    @Override
    void sound()
    {
        System.out.println("Dog barks");
    }
}

class Cat extends Animal
{
    @Override
    void sound()
    {
        System.out.println("Cat meows");
    }
}

public class Runtime_Polymorphism
{
    public static void main(String[] args)
    {
        Animal a;

        a = new Dog();  // upcasting
        a.sound();      // Dog's version of sound() is called

        a = new Cat();  // upcasting
        a.sound();      // Cat's version of sound() is called
    }
}
