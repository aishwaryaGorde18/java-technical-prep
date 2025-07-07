package CollectionFrameworkExample;
import java.util.*;
public class ArrayListExample
{
    public static void main(String[] args)
    {
        List<String> fruits = new ArrayList<>();

        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Mango");

        System.out.println("Fruits in the list:");
        for (String fruit : fruits) {
            System.out.println(fruit);
        }
    }
}
