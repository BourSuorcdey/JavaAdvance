import java.util.List;

public class GenericsBoundType {
    public static <T extends Number> double sum(List<T> number){
        double total = 0;
        for(T num : number){
            total += num.doubleValue();
        }
        return total;
    }

    public static void main(String[] args) {
        List<Integer> number = List.of(1, 2, 3, 4);

        double total = sum(number);
        System.out.println(total);

        List<Long> nums = List.of(1l, 2l, 3l);
        double total1 = sum(nums);
        System.out.println(total1);
    }
}
