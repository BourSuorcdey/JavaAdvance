import java.util.*;

public class GenericsMethod {
    public static <T> boolean isEqual(GenericsType<T> t1, GenericsType<T> t2){
        return t1.getValue().equals(t2.getValue());
    }

    public static <T> List<T> combine(List<T> list1, List<T> list2){
        List<T> result = new LinkedList<>();
        result.addAll(list1);
        result.addAll(list2);
        return result;
    }

    public static void main(String[] args) {
        /*
        GenericsType<Integer> t1 = new GenericsType<>();
        t1.setValue(5);

        GenericsType<Integer> t2 = new GenericsType<>();
        t2.setValue(5);

        boolean test = GenericsMethod.isEqual(t1, t2);
        System.out.println(test);
         */

        List<String> list1 = new LinkedList<>();
        list1.add("Test1");
        list1.add("Test2");

        List<String> list2 = new LinkedList<>();
        list2.add("Test3");
        list2.add("Test4");

        List<String> result = combine(list1, list2);
        System.out.println(result);
    }
}

