package lambda;

import java.text.Collator;
import java.util.*;

public class Main {
    public static void main(String[] args) {

        // related to test
        Test test = new LambdaDemo();
        test.display();

        // lambda
        Test test1 = () -> System.out.println("From lambda");
        test1.display();

        // related to convertor
        Convertor intConvertor = new IntegerConvertor();
        int textLength = intConvertor.toInteger("Java Demo");
        System.out.println(textLength);

        // lambda
        Convertor intConvertor1 = (text) -> text.length();
        int textLength1 = intConvertor1.toInteger("Hello World");
        System.out.println(textLength1);

        // increment
        Increment increment = (text, n) -> text.length() + n;
        Integer result = increment.increment("Java", 20);
        System.out.println(result);

        Increment increment1 = (text, n) -> {
            int textL = text.length();
            int total = textL + n + 10;
          return total;
        };
        Integer result1 = increment1.increment("Java Advance", 20);
        System.out.println(result1);

        // lambda as object
        List<Integer> number = new ArrayList<>();
        number.add(23);
        number.add(21);
        number.add(54);
        number.add(65);
        number.add(11);
        number.add(34);
        //List.of(23, 21, 54, 65, 11, 34); //immutable collection can not sort
        System.out.println(number);
        /*
        Collections.sort(number, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1 - o2;
            }
        });
         */
        //Comparator<Integer> order = (x, y) -> x - y;
        Collections.sort(number, (x, y) -> x - y);
        System.out.println("After Sort: ");
        System.out.println(number);

        // my convertor
        Convertor convertor = text -> text.length();
        System.out.println(convertor.toInteger("Dara"));

        // method reference
        Convertor convertor1 = MyConvertor::convertStringToInt;
        System.out.println(convertor1.toInteger(" Dara "));

        Convertor convertor2 = MyConvertor::convertStringToIntTrim;
        System.out.println(convertor2.toInteger(" Dara "));

        // lambda
        Finder finder = (text, st) -> text.indexOf(st);
        int found = finder.find("Java Developer", "Dev");
        System.out.println(found);

        // Parameter method reference.
        // method reference
        Finder finder1 = String::indexOf;
        System.out.println(finder1.find("Dara is a good boy", "boy"));

        // String finder
        StringFinder stringFinder = new StringFinder();
        Finder finder2 = stringFinder::search;
        System.out.println(finder2.find("Java", "va"));

        // Constructor method reference
        PersonCreator creator = (n, g, age) -> new Student(n, g, age);
        Student dara = creator.create("Dara", "M", 21);
        System.out.println(dara);
    }
}