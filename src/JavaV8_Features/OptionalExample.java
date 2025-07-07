package JavaV8_Features;

import java.util.Optional;

public class OptionalExample {
    public static void main(String[] args) {

        // Create Optional with value
        Optional<String> name = Optional.of("Java");

        // 1. get()
        System.out.println("Value: " + name.get());  // Output: Java

        // 2. isPresent()
        if (name.isPresent()) {
            System.out.println("Value is present.");
        }

        // 3. ifPresent()
        name.ifPresent(n -> System.out.println("Hello, " + n));  // Output: Hello, Java

        // 4. orElse()
        String result1 = name.orElse("Default");
        System.out.println("orElse: " + result1);  // Output: Java

        // 5. orElseGet()
        String result2 = name.orElseGet(() -> "Default from Supplier");
        System.out.println("orElseGet: " + result2);  // Output: Java

        // 6. map()
        Optional<String> upperName = name.map(n -> n.toUpperCase());
        System.out.println("Uppercase: " + upperName.get());  // Output: JAVA

        // 7. filter()
        Optional<String> filteredName = name.filter(n -> n.startsWith("J"));
        System.out.println("Filtered: " + filteredName.orElse("Not matched"));  // Output: Java
}
}
