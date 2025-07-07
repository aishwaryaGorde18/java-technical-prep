package CollectionFrameworkExample;

import java.util.*;

public class PriorityQueueExample
{
    public static void main(String[] args)
    {
        PriorityQueue<Integer> pq = new PriorityQueue<>();

        // Add elements
        pq.add(5);
        pq.add(2);
        pq.add(8);

        System.out.println("PriorityQueue: " + pq);

        System.out.println("Peek: " + pq.peek());

        System.out.println("Polled: " + pq.poll());

        System.out.println("PriorityQueue after poll: " + pq);
    }
}

