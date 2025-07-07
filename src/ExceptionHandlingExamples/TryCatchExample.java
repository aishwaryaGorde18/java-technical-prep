package ExceptionHandlingExamples;

public class TryCatchExample
{
    public static void main(String[] args)
    {
        int num1 = 10;
        int num2 = 0;
        int result;

        try
        {
            result = num1 / num2;
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Exception caught: Cannot divide by zero.");
        }

        System.out.println("Program continues after exception handling.");
    }
}

