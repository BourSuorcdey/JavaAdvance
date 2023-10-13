package buildinfunctioninterface;

import java.util.function.Supplier;

public class SupplierDemo {
    public static void main(String[] args) {
        // if the class IntegerSupplier is not static we need to create obj of class SupplierDemo
        // Supplier important in lazy part

        Supplier<Integer> integerSupplier = new IntegerSupplier();
        System.out.println(integerSupplier.get());

        Supplier<Double> integerSupplier1 = () -> (Double) Math.random()*20;
        System.out.println(integerSupplier1.get());

        Supplier<String> nameSupplier = () -> "Dara";
    }
    public static class IntegerSupplier implements Supplier<Integer> {
        @Override
        public Integer get() {
            return 300;
        }
    };
}
