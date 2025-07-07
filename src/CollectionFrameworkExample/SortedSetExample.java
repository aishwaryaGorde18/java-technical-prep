package CollectionFrameworkExample;

import java.util.*;

public class SortedSetExample
{
    public static void main(String[] args)
    {
        SortedSet<Integer> numbers = new TreeSet<>();

        numbers.add(40);
        numbers.add(10);
        numbers.add(30);
        numbers.add(20);
        numbers.add(10); // duplicate, won't be added

        System.out.println("SortedSet: " + numbers);

        System.out.println("First element: " + numbers.first());
        System.out.println("Last element: " + numbers.last());

        System.out.println("HeadSet (less than 30): " + numbers.headSet(30));
        System.out.println("TailSet (greater than or equal to 20): " + numbers.tailSet(20));
        System.out.println("SubSet (20 to 40): " + numbers.subSet(20, 40));
    }
}

