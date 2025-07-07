package JavaV8_Features;

import java.util.function.Consumer;

public class ConsumerExample {
    public static void main(String[] args) {
        Consumer<String> printMessage =
                message -> System.out.println("Hello, " + message);

        printMessage.accept("Java");
    }
}
