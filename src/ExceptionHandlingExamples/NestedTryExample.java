package ExceptionHandlingExamples;

public class NestedTryExample
{
    public static void main(String[] args)
    {
        try {
            // Outer try block
            int[] arr = new int[3];
            arr[2] = 10;
            System.out.println("Outer try block executed.");

            try
            {
                // Inner try block
                int result = 100 / 0;  // ArithmeticException
                System.out.println("Result: " + result);
            } catch (ArithmeticException e)
            {
                System.out.println("Inner catch: Cannot divide by zero.");
            }

        } catch (ArrayIndexOutOfBoundsException e)
        {
            System.out.println("Outer catch: Array index out of bounds.");
        }

        System.out.println("Program continues after nested try-catch.");
    }
}

