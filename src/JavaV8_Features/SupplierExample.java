package JavaV8_Features;

import java.util.function.Supplier;

public class SupplierExample
{
    public static void main(String[] args)
    {
        Supplier<String> getGreeting = () -> "Welcome to Functional Interfaces!";
        System.out.println(getGreeting.get());
}
}
