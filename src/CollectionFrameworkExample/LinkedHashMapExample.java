package CollectionFrameworkExample;

import java.util.*;

public class LinkedHashMapExample
{
    public static void main(String[] args)
    {
        LinkedHashMap<Integer, String> map = new LinkedHashMap<>();

        // Add key-value pairs
        map.put(101, "Apple");
        map.put(103, "Mango");
        map.put(102, "Banana");

        System.out.println("LinkedHashMap: " + map);

        System.out.println("Value for key 102: " + map.get(102));

        map.remove(101);

        System.out.println("After removing key 101: " + map);
    }
}

