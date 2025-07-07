package CollectionFrameworkExample;

import java.util.*;

public class ArrayDequeueExample {
    public static void main(String[] args) {
        // Create an ArrayDeque of Strings
        ArrayDeque<String> deque = new ArrayDeque<>();

        // Add elements to the deque
        deque.add("One");
        deque.add("Two");
        deque.add("Three");

        System.out.println("Deque: " + deque);

        // Remove the first element
        deque.remove();

        // Print the deque after removal
        System.out.println("After remove: " + deque);
    }
}

