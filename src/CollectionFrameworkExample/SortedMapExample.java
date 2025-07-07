package CollectionFrameworkExample;

import java.util.*;

public class SortedMapExample {
    public static void main(String[] args) {
        SortedMap<Integer, String> map = new TreeMap<>();

        map.put(3, "Banana");
        map.put(1, "Apple");
        map.put(2, "Mango");

        System.out.println("SortedMap: " + map);

        System.out.println("First key: " + map.firstKey());
        System.out.println("Last key: " + map.lastKey());

        System.out.println("Head Map (keys < 3): " + map.headMap(3));
        System.out.println("Tail Map (keys >= 2): " + map.tailMap(2));
    }
}

