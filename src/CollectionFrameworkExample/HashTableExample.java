package CollectionFrameworkExample;

import java.util.*;

public class HashTableExample
{
    public static void main(String[] args)
    {
        Hashtable<Integer, String> table = new Hashtable<>();

        table.put(1, "Apple");
        table.put(2, "Mango");
        table.put(3, "Banana");

        System.out.println("Hashtable: " + table);

        System.out.println("Value for key 2: " + table.get(2));

        table.remove(3);

        System.out.println("After removing key 3: " + table);
    }
}

