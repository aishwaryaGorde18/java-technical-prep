package StringExamples;

public class StringCreation
{
    public static void main(String[] args)
    {
        // 1. Creating string using string literal
        String str1 = "Hello";

        // 2. Creating string using 'new' keyword
        String str2 = new String("World");

        // 3. Creating string from char array
        char[] charArray = { 'J', 'a', 'v', 'a' };
        String str3 = new String(charArray);

        // 4. Creating empty string
        String str4 = "";

        // Printing the strings
        System.out.println("String 1: " + str1);
        System.out.println("String 2: " + str2);
        System.out.println("String 3: " + str3);
        System.out.println("String 4 (empty): \"" + str4 +"\"");
}
}
