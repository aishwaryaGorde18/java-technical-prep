package CollectionFrameworkExample;


import java.util.LinkedList;

public class LinkedListExample
{
    public static void main(String[] args)
    {
        LinkedList<String> animals = new LinkedList<>();

        animals.add("Dog");
        animals.add("Cat");
        animals.add("Cow");

        animals.addFirst("Horse");

        animals.addLast("Sheep");

        System.out.println("First Element: " + animals.getFirst());
        System.out.println("Last Element: " + animals.getLast());

        animals.removeFirst();
        animals.removeLast();

        System.out.println("Updated LinkedList: " + animals);
    }
}
