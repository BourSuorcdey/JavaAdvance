package streamapi;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static java.util.Locale.filter;

public class StreamDemo {
    public static void main(String[] args) {
        // source
        List<String> list = new ArrayList<>();
        list.add("Dara");
        list.add("Sok");
        list.add("Sao");

        Long number = list.stream()
                .filter(s -> s.endsWith("a"))
                .count();
        System.out.println(number);

        Optional<String> nameOptional = list.stream()
                .filter(s -> s.contains("a"))
                .findAny();
        if(nameOptional.isPresent()) {
            System.out.println(nameOptional.get());
        } else {
            System.out.println("Not found !!");
        }
        /*
        list.stream()
                .filter(s -> s.length()%2 == 0)
                .forEach(System.out::println);

        // reduce
        // collect

        /*
        list.stream()
                .map(s -> s.length())
                .filter(n -> n%2 == 0)
                .forEach(s -> System.out.println(s));
         */
        /*
        // stream method:
        // What you want
        Stream<String> stream1 = list.stream();
        //Function<String, String> lowerCase = x -> x.toLowerCase();
        //Function<String, String> lowerCase = String::toLowerCase;
        stream1 = stream1.map(String::toLowerCase);
        Consumer<String> print = x -> System.out.println(x);
        stream1.forEach(print);
         */
        /*
        List<Character> collect = list.stream()
                .map(x -> x.toLowerCase())
                .map(x -> x.charAt(0))
                //.forEach(x -> System.out.println(x));
                .collect(Collectors.toList());
        System.out.println(collect);
         */
    }
}
