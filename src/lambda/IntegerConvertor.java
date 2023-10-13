package lambda;

public class IntegerConvertor implements Convertor{
    @Override
    public int toInteger(String text) {
        return text.length();
    }
}
