import java.util.ArrayList;
import java.util.List;

public class GenericsInheritance {
    public static void main(String[] args) {
        String str = "Dara";
        Object obj = new Object();
        obj = str;

        Piseth<String> strG = new Piseth<>();
        Piseth<Object> objG = new Piseth<>();
        // Not related
        //objG = strG;
        obj = strG;

        Jazz<Object> s1 = new Jazz<>();
        objG = s1;

        Joke<String> s2 = new Joke<>();
        strG = s2;

        List<Integer> list = new ArrayList<>();
    }
    static class Piseth<T>{

    }
    static class Jazz<T> extends Piseth<T>{

    }

    static class Joke<T> extends Piseth<T>{

    }
}