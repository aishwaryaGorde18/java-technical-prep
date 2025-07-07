package CollectionFrameworkExample;

import java.util.LinkedHashSet;

public class LinkedHashSetExample
{
    public static void main(String[] args)
    {
        LinkedHashSet<String> languages = new LinkedHashSet<>();

        languages.add("Java");
        languages.add("Python");
        languages.add("C++");
        languages.add("Java"); // duplicate, will be ignored

        System.out.println("Programming Languages:");
        for (String lang : languages) {
            System.out.println(lang);
        }
    }
}

