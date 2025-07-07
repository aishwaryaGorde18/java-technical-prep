import java.util.ArrayList;
import java.util.function.BiFunction;

public class VarExample {
    public static void main(String[] args) {
        // Java 10 feature: var for local variables
        var name = "Alice"; // inferred as String
        var age = 30;       // inferred as int
        var list = new ArrayList<String>(); // inferred as ArrayList<String>

        list.add("Java");
        list.add("Python");
        list.add("Kotlin");

        // Java 11 feature: var in lambda parameters
        list.forEach((var item) -> System.out.println("Language: " + item));

        // Using BiFunction with var in lambda parameters
        BiFunction<Integer, Integer, Integer> add = (var a, var b) -> a + b;
        System.out.println("Sum: " + add.apply(10, 20));
}
}