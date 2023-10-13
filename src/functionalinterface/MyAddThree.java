package functionalinterface;

import functionalinterface.AddNumber;

import java.util.function.BiFunction;

public class MyAddThree implements AddNumber {
    @Override
    public Integer add(int number) {
        return number + 3;
    }

}
