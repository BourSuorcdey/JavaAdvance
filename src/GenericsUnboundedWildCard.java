import java.util.List;
import java.util.Objects;

public class GenericsUnboundedWildCard {
    public static void main(String[] args) {

        List<String> string = List.of("Dara", "Kosoma");
        printData(string);

        List<Integer> integer = List.of(1, 2, 3);
        printData(integer);
    }
    public static void printData(List<?> list){
        for(int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }

    // is not related to integer or string
//    public static void printDataObject(List<Object> number) {
//        for(int i = 0; i < list.size(); i++) {
//            System.out.println(list.get(i));
//        }
//    }

    // Unbounded wildcard
    // List<?>
}
