package ExceptionHandlingExamples;

public class FinallyExample
{
    public static void main(String[] args)
    {
        try
        {
            int num = 10, denom = 0;
            int result = num / denom;  // This will throw ArithmeticException
            System.out.println("Result: " + result);
        } catch (ArithmeticException e)
        {
            System.out.println("Catch block: Cannot divide by zero.");
        } finally {
            System.out.println("Finally block: This block always executes.");
        }

        System.out.println("Program continues...");
    }
}

