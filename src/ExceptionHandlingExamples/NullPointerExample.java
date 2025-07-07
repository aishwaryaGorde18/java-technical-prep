package ExceptionHandlingExamples;

public class NullPointerExample
{
    public static void main(String[] args)
    {
        int[] numbers = null;

        try
        {
            System.out.println("Array length: " + numbers.length);
        } catch (NullPointerException e) {
            System.out.println("Caught NullPointerException: Array is null.");
        }

        System.out.println("Program continues after exception handling.");
}
}
