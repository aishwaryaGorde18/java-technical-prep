package ExceptionHandlingExamples;

public class MultipleCatchExample
{
    public static void main(String[] args)
    {
        try
        {
            int[] numbers = {1, 2, 3};
            int result = numbers[5] / 0;
            System.out.println("Result: " + result);
        } catch (ArithmeticException e)
        {
            System.out.println("ArithmeticException caught: Division by zero.");
        } catch (ArrayIndexOutOfBoundsException e)
        {
            System.out.println("ArrayIndexOutOfBoundsException caught: Invalid array index.");
        } catch (Exception e)
        {
            System.out.println("General exception caught: " + e);
        }

        System.out.println("Program continues after handling exceptions.");
    }
}

