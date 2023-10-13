import java.util.ArrayList;
import java.util.List;

public class SubtypingUsingGenericsWildcard {
    public static void main(String[] args) {
        List<Integer> list1 = new ArrayList<>();
        List<? extends Integer> list2 = new ArrayList<>();
        List<? extends String> list3 = new ArrayList<>();

        List<? extends Number> list = list1;
        list = list2;
        // is no related
        // list = list3;
    }

}
