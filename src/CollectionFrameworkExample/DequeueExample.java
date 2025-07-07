package CollectionFrameworkExample;

import java.util.*;
public class DequeueExample
{
    public static void main(String[] args)
    {
        Deque<String> deque = new ArrayDeque<>();

        // Add elements at the end
        deque.addLast("Apple");
        deque.addLast("Banana");

        // Add element at the front
        deque.addFirst("Mango");

        System.out.println("Deque: " + deque);

        // Peek elements from both ends
        System.out.println("First: " + deque.peekFirst()); // Mango
        System.out.println("Last: " + deque.peekLast());   // Banana

        // Remove elements from both ends
        System.out.println("Removed First: " + deque.removeFirst()); // Mango
        System.out.println("Removed Last: " + deque.removeLast());   // Banana

        // Show final deque
        System.out.println("Final Deque: " + deque); // [Apple]
    }
}

