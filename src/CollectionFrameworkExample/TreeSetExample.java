package CollectionFrameworkExample;

import java.util.TreeSet;

public class TreeSetExample
{
    public static void main(String[] args)
    {
        TreeSet<Integer> numbers = new TreeSet<>();

        // Adding elements
        numbers.add(50);
        numbers.add(10);
        numbers.add(30);
        numbers.add(20);
        numbers.add(10); // duplicate, ignored

        System.out.println("Sorted Numbers:");
        for (int num : numbers) {
            System.out.println(num);
        }
    }
}
