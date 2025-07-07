// Public class, can be accessed from anywhere
public class AccessModifierExample {

    // Public field, accessible from anywhere
    public int publicVar = 10;

    // Private field, accessible only within this class
    private int privateVar = 20;

    // Protected field, accessible within the same package and by subclasses
    protected int protectedVar = 30;

    // Default (package-private) field, accessible only within the same package
    int defaultVar = 40;

    // Public method, can be accessed from anywhere
    public void publicMethod() {
        System.out.println("Public method");
    }

    // Private method, can only be accessed within this class
    private void privateMethod() {
        System.out.println("Private method");
    }

    // Protected method, accessible within the same package and by subclasses
    protected void protectedMethod() {
        System.out.println("Protected method");
    }

    // Default (package-private) method, accessible within the same package
    void defaultMethod() {
        System.out.println("Default (package-private) method");
    }

    public static void main(String[] args) {
        // Creating an object of AccessModifiersExample
        AccessModifierExample example = new AccessModifierExample();

        // Accessing public field and method
        System.out.println("Public variable: " + example.publicVar);
        example.publicMethod();

        // Accessing private field and method (Not allowed, will cause a compilation error)
        // System.out.println("Private variable: " + example.privateVar);  // Error
        // example.privateMethod();  // Error

        // Accessing protected field and method
        System.out.println("Protected variable: " + example.protectedVar);
        example.protectedMethod();

        // Accessing default (package-private) field and method
        System.out.println("Default variable: " + example.defaultVar);
        example.defaultMethod();
    }
}
