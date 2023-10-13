package buildinfunctioninterface;

import java.util.function.UnaryOperator;

public class UnaryOperatorDemo {
    public static void main(String[] args) {
        UnaryOperator<String> textAndLength = n -> n + " " + n.length();
        String result = textAndLength.apply("Messi");
        System.out.println(result);
    }
}
