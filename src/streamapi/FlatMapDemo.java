package streamapi;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FlatMapDemo {
    public static void main(String[] args) {
        test2();
    }
    public static void test2() {
        List<Integer> list1 = new ArrayList<>();
        list1.add(100);
        list1.add(200);
        list1.add(300);

        List<Integer> list2 = new ArrayList<>();
        list2.add(400);
        list2.add(500);
        list2.add(600);

        List<List<Integer>> bigList = new ArrayList<>();
        bigList.add(list1);
        bigList.add(list2);

        System.out.println(bigList);
        // [100, 200, 300, 400, 500, 600]

        List<Integer> collect = bigList.stream()
                .flatMap(x -> x.stream())
                .collect(Collectors.toList());
        System.out.println(collect);
        // flatmap convert string to multiple element
                /*
                [10, 20, 30]
                //after use flatmap
                10
                20
                30
                 */
    }

    public  static void test1() {
        List<String> list = new ArrayList<>();
        list.add("Dara is a good developer");
        list.add("Sok is a student");
        list.add("Sao go to school");

        // stream<String> = stream of word
        list.stream()
                .flatMap(t -> Arrays.stream(t.split(" ")))
                .forEach(System.out::println);
    }
}
