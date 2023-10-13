package lambda;

public class MyConvertor {
    static int convertStringToInt(String st){
        return st.length();
    };

    static int convertStringToIntTrim(String st){
        return st.trim().length();
    };
}
