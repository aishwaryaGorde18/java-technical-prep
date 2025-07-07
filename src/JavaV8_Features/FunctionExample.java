package JavaV8_Features;

import java.util.function.Function;

public class FunctionExample
{
    public static void main(String[] args)
    {
        Function<String, Integer> getLength = str -> str.length();
        System.out.println("Length: " + getLength.apply("Java"));
    }
}