public class DataTypesExample
{
    public static void main(String[] args)
    {
        // Primitive data types
        int age = 25;              // Integer
        double price = 19.99;      // Decimal number
        char grade = 'A';          // Single character
        boolean isJavaFun = true;  // Boolean value (true/false)
        byte smallNumber = 100;    // Small integer (-128 to 127)
        short shortNumber = 32000; // Short integer
        long bigNumber = 123456789L; // Large integer
        float pi = 3.14f;          // Floating point number

        // Non-primitive data type
        String message = "Hello, Java!"; // String (object)

        // Print values
        System.out.println("Age: " + age);
        System.out.println("Price: $" + price);
        System.out.println("Grade: " + grade);
        System.out.println("Is Java fun? " + isJavaFun);
        System.out.println("Byte value: " + smallNumber);
        System.out.println("Short value: " + shortNumber);
        System.out.println("Long value: " + bigNumber);
        System.out.println("Float value: " + pi);
        System.out.println("Message: " + message);
    }
}
