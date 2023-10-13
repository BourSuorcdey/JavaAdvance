import java.util.ArrayList;
import java.util.List;

public class GenericsWildCard {
    /*
    // Can
    // parameter
    // field
    // local variable
    // return type

    // Can not
    // invoking a generics method
    // instantiating a generics class
     */

    public static void main(String[] args) {
        List<String> list = List.of("Dara", "Kosoma");
        display(list);

        //local variable
        List<?> list1 = new ArrayList<>();
        //list1.add("str");

        List<Integer> list2 = new ArrayList<>();
        list2.add(2);

        Piseth<String> p = new Piseth<>();
        Piseth<?> p1 = new Piseth<>();
    }

    public List<?> getList(){
        return null;
    }
    public static void display(List<?> list) {
        for(int i = 0; i < list.size(); i++){
            System.out.println(list.get(i));
        }
    }

    static  class Piseth<T>{

    }
}
