package ExceptionHandlingExamples;
class InvalidAgeException extends Exception
{
    public InvalidAgeException(String message)
    {
        super(message);
    }
}
public class CustomExceptionExample
{

    static void checkAge(int age) throws InvalidAgeException
    {
        if (age < 18)
        {
            throw new InvalidAgeException("You must be at least 18 years old.");
        } else
        {
            System.out.println("Access granted – You are old enough!");
        }
    }

    public static void main(String[] args)
    {
        try
        {
            checkAge(15);
        } catch (InvalidAgeException e)
        {
            System.out.println("Caught custom exception: " + e.getMessage());
        }

        System.out.println("Program continues...");
    }
}

