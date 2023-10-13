package lambda;
@FunctionalInterface

public interface Convertor {
    // implicit public. It's mean auto public access modifier
    int toInteger(String text);
}
