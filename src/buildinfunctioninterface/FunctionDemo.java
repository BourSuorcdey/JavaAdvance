package buildinfunctioninterface;
import java.util.function.Function;

public class FunctionDemo {
    public static void main(String[] args) {
        // Function<T, R>
        // T: input
        // R: Return (output)

        int n = getNumberOfChar("Java");
        System.out.println(n);

        Function<String, Integer> countChar = name -> name.length();
        Integer numberC = countChar.apply("Dara Kon");
        System.out.println(numberC);

        Function<Integer, Long> factorial = k -> {
            long total = 1;
            for (int i = k; i > 0; i--) {
                total *= i;
            }
            return total;
        };
        System.out.println(factorial.apply(5));

        //System.out.println(fact(4));
        //System.out.println(fact2(4));
    }

    // recursive
    public static long fact2(int n) {
        if(n == 1) {
            return 1;
        }
        else {
            return n * fact2(n - 1);
        }
    }

    public static  long fact(int n) {
        int total = 1;
        for (int i = n; i > 0; i--) {
            total *= i;
        }
        return total;
    }

    public static int getNumberOfChar(String text){
        return text.length();
    }
}

// Build in functional interface: SAM
// Function
// Predicate
// Supplier
// Consumer
// UnaryOperator
// BinaryOperator
