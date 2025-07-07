package CollectionFrameworkExample;


import java.util.*;

public class HashMapExample
{
    public static void main(String[] args)
    {
        Map<Integer, String> students = new HashMap<>();

        students.put(101, "Aishwarya");
        students.put(102, "Trisha");
        students.put(103, "Rucha");

        System.out.println("Student List:");
        for (Map.Entry<Integer, String> entry : students.entrySet())
        {
            System.out.println("ID: " + entry.getKey() + ", Name: " + entry.getValue());
        }
    }
}
