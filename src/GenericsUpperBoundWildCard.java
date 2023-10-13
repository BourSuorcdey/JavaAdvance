import java.util.List;

public class GenericsUpperBoundWildCard {
    public static void main(String[] args) {
        List<Integer> number = List.of(1, 2, 3, 4, 5);
        double total = sum(number);
        System.out.println(total);
    }

    public static double sum(List<? extends Number> number){
        double total = 0;
        for(Number num : number){
            total += num.doubleValue();
        }
        return total;
    }

    // Upper bounded wildcard
    //List<? extends Number> number
}
