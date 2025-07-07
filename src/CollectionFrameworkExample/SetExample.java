package CollectionFrameworkExample;
import java.util.*;

public class SetExample
{
    public static void main(String[] args)
    {
        Set<String> colors = new HashSet<>();

        colors.add("Red");
        colors.add("Green");
        colors.add("Blue");
        colors.add("Red"); // Duplicate, will be ignored

        System.out.println("Colors in the set:");
        for (String color : colors) {
            System.out.println(color);
        }
    }
}
