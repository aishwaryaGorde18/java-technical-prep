package CollectionFrameworkExample;

import java.util.*;

public class SimpleQueueExample
{
    public static void main(String[] args)
    {
        Queue<String> queue = new LinkedList<>();

        queue.add("One");
        queue.add("Two");
        queue.add("Three");

        System.out.println("Queue: " + queue);

        System.out.println("Peek (front): " + queue.peek());

        System.out.println("Removed: " + queue.remove());

        System.out.println("Queue after remove: " + queue);

        System.out.println("Polled: " + queue.poll());

        System.out.println("Queue after poll: " + queue);
    }
}

