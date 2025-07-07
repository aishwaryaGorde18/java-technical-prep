// Java program to demonstrate Widening Type Casting
class TypecastingWidening
{
    public static void main(String[] args)
    {
        int i = 10;

        // Widening Type Casting (Automatic Casting)
        // int to long
        long l = i;

        // Widening Type Casting (Automatic Casting)
        // int to double
        double d = i;

        // Display results
        System.out.println("Integer: " + i);
        System.out.println("Long: " + l);
        System.out.println("Double: " + d);
    }
}
