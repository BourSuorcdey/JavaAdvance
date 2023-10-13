import java.util.ArrayList;
import java.util.List;

public class GenericsLowerBoundWildCard {
    public static void main(String[] args) {
        List<Integer>  list = new ArrayList<>();
        list.add(1);
        list.add(2);
        addInteger(list);
        System.out.println(list);
    }

    public static void addInteger(List<? super Integer> number) {
        number.add(5);
    }

    // Lower bounded wildcard
    // List<? super Integer> number
}
