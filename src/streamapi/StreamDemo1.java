package streamapi;

import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

import static java.util.Arrays.stream;

public class StreamDemo1 {
    public static void main(String[] args) {
        List<Integer> num = List.of(23, 12, 22, 32, 14, 24, 56);

        Optional<Integer> min = num.stream()
                .min((x,y) -> x.compareTo(y));
        System.out.println(min);
    }
}
