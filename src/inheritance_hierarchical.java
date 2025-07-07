// Parent class
class Animal1 {
    public void eat() {
        System.out.println("Animal is eating...");
    }
}
// First child class
class Dog1 extends Animal1 {
    public void bark() {
        System.out.println("Dog is barking...");
    }
}
// Second child class
class Cat1 extends Animal1 {
    public void meow() {
        System.out.println("Cat is meowing...");
    }
}

// Main class
public class inheritance_hierarchical
{
    public static void main(String[] args) {
        Dog1 d = new Dog1();
        d.eat();
        d.bark();
        Cat1 c = new Cat1();
        c.eat();
        c.meow();
    }
}

