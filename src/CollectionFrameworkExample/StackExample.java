package CollectionFrameworkExample;
import java.util.*;
public class StackExample
{
    public static void main(String[] args)
    {
        Stack<String> stack = new Stack<>();

        stack.push("Apple");
        stack.push("Banana");
        stack.push("Cherry");

        System.out.println("Top element: " + stack.peek());

        System.out.println("Popped: " + stack.pop());
        System.out.println("Popped: " + stack.pop());

        System.out.println("Is stack empty? " + stack.empty());

        System.out.println("Top now: " + stack.peek());
    }
}
