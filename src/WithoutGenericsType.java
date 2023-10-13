public class WithoutGenericsType {
    private Object value;

    public Object getValue(){
        return value;
    }

    public void setValue(Object value){
        this.value = value;
    }

    public static void main(String[] args) {
        WithoutGenericsType type = new WithoutGenericsType();
        type.setValue("hello");

        String st = (String) type.getValue();
        System.out.println(st);
    }
}
