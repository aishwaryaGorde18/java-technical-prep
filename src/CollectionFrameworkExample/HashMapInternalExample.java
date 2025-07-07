package CollectionFrameworkExample;

import java.util.HashMap;

public class HashMapInternalExample
{
    public static void main(String[] args)
    {
        HashMap<String, String> map = new HashMap<>();

        // Put some key-value pairs
        map.put("A", "Apple");
        map.put("B", "Banana");
        map.put("C", "Cherry");
        map.put("D", "Dates");

        // Retrieve a value
        String value = map.get("B");
        System.out.println("Value for key 'B': " + value);
    }
}

