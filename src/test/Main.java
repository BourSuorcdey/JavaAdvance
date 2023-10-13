package test;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {

        Function<Integer, Integer> myFunction = new Function<>() {
            @Override
            public Integer apply(Integer integer) {
                return integer + 200;
            }
        };

        Function<Integer, Integer> myFunction1 = integer -> integer + 200;

        Integer apply = myFunction.apply(200);
        System.out.println(apply);

        Integer apply1 = myFunction1.apply(300);
        System.out.println(apply1);

        List<Integer> list = List.of(1, 2, 3, 4);

        for (Integer num : list) {
            System.out.println(num);
        }
        
    }
}
