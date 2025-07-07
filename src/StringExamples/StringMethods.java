package StringExamples;

public class StringMethods
{
    public static void main(String[] args)
    {
        String str = "  Hello Java World  ";

        // Original string
        System.out.println("Original: '" + str + "'");

        // length()
        System.out.println("Length: " + str.length());

        // trim()
        String trimmed = str.trim();
        System.out.println("Trimmed: '" + trimmed + "'");

        // toUpperCase()
        System.out.println("Uppercase: " + trimmed.toUpperCase());

        // toLowerCase()
        System.out.println("Lowercase: " + trimmed.toLowerCase());

        // charAt()
        System.out.println("Character at index 6: " + trimmed.charAt(6));

        // substring()
        System.out.println("Substring (6 to 10): " + trimmed.substring(6, 10));

        // replace()
        System.out.println("Replace 'Java' with 'Python': " + trimmed.replace("Java", "Python"));

        // contains()
        System.out.println("Contains 'World': " + trimmed.contains("World"));

        // equals()
        System.out.println("Equals 'Hello Java World': " + trimmed.equals("Hello Java World"));

        // equalsIgnoreCase()
        System.out.println("EqualsIgnoreCase 'hello java world': " + trimmed.equalsIgnoreCase("hello java world"));

        // indexOf()
        System.out.println("Index of 'Java': " + trimmed.indexOf("Java"));
    }
}
