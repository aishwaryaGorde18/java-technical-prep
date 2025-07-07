package JavaV8_Features;

import java.util.function.Predicate;

public class PredicateExample
{
    public static void main(String[] args)
    {
        Predicate<Integer> isEven = number -> number % 2 == 0;
        System.out.println("Is 10 even? " + isEven.test(10));
}
}
