package buildinfunctioninterface;

import java.util.List;
import java.util.function.BinaryOperator;
import java.util.function.Consumer;
import java.util.function.Function;

public class BinaryOperatorDemo {
    public static void main(String[] args) {
        Function<String, Integer> toLength = text -> text.length();
        Function<Integer, Integer> power2 = num -> num * num;

        Integer numOfString = toLength.andThen(power2).apply("Dara");
        System.out.println(numOfString);

        BinaryOperator<String> combineLength = (a, b) -> (a + b).toUpperCase();
        String result = combineLength.apply("Welcome", " to RUPP.");
        System.out.println(result);


        List<String> name = List.of("Makara", "Lika", "Messi");
//        Function<String, String> cap = n -> n.toUpperCase();
//        Consumer<String> print = k -> System.out.println(k);
//        name.stream().map(cap).forEach(print);

        // Lambda expression
        // name.stream().map(n -> n.toUpperCase()).forEach(k -> System.out.println(k));

        // method reference
        name.stream().map(String::toUpperCase).forEach(System.out::println);
    }
}
