package StringExamples;

public class StringmethodDemo
{
    public static void main(String[] args)
    {
        String str = "  Hello, Java World!  ";

        // 1. length()
        System.out.println("Length: " + str.length());

        // 2. charAt()
        System.out.println("Character at index 7: " + str.charAt(7));

        // 3. equals()
        System.out.println("Equals 'Hello': " + str.trim().equals("Hello"));

        // 4. split()
        String[] words = str.trim().split(" ");
        System.out.println("Split words:");
        for (String word : words)
        {
            System.out.println(word);
        }

        // 5. matches()
        System.out.println("Matches regex '[A-Za-z, ]+': " + str.trim().matches("[A-Za-z, ]+"));

        // 6. replaceAll()
        System.out.println("Replace 'Java' with 'Python': " + str.replaceAll("Java", "Python"));

        // 7. trim()
        System.out.println("After trim: '" + str.trim() + "'");

        // 8. strip() (Java 11+)
        System.out.println("After strip: '" + str.strip() + "'");

        // 9. toUpperCase()
        System.out.println("Uppercase: " + str.toUpperCase());

        // 10. toLowerCase()
        System.out.println("Lowercase: " + str.toLowerCase());

        // 11. indexOf()
        System.out.println("Index of 'Java': " + str.indexOf("Java"));

        // 12. lastIndexOf()
        System.out.println("Last index of 'l': " + str.lastIndexOf('l'));

        // 13. contains()
        System.out.println("Contains 'World': " + str.contains("World"));

        // 14. substring()
        System.out.println("Substring (7 to 11): " + str.substring(7, 11));

        // 15. join()
        String joined = String.join(" - ", "Apple", "Banana", "Cherry");
        System.out.println("Joined: " + joined);

        // 16. toCharArray()
        char[] chars = str.toCharArray();
        System.out.print("Characters: ");
        for (char c : chars)
        {
            System.out.print(c + " ");
        }
        System.out.println();

        // 17. valueOf()
        int number = 123;
        String numStr = String.valueOf(number);
        System.out.println("String.valueOf(123): " + numStr);
    }
}