package buildinfunctioninterface;
import java.util.function.Predicate;
import java.util.function.Function;


public class PredicateDemo {
    public static void main(String[] args) {
        // Predicate<T>
        // Function<T, Boolean>
        Function<String, Boolean> checkA = n -> n.contains("a");
        Boolean haveA = checkA.apply("dy");
        System.out.println(haveA);

        Predicate<String> checkB = name -> name.contains("a");
        System.out.println(checkB.test("Vannda"));

        // Stream API

    }
}
