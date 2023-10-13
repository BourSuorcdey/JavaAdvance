package buildinfunctioninterface;

import java.util.Objects;
import java.util.function.Consumer;

public class ConsumerDemo {
    public static void main(String[] args) {
//        Consumer<String> lengthConsumer = new Consumer<String>() {
//            @Override
//            public void accept(String t) {
//                System.out.println("Your text is:"+ t);
//                System.out.println("Text length: "+ t.length());
//            }
//        };
//        lengthConsumer.accept("Hello Dara");
        Consumer<String> lengthConsumer = text -> {
            System.out.println("Your text is: "+ text);
            System.out.println("Text length is: "+ text.length());
        };
        lengthConsumer.accept("Hello Dara");

        Consumer<String> print = text -> System.out.println(text);
        print.accept("Hello world");
    }
}
