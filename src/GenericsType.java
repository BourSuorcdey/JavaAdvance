public class GenericsType<T> {
    private T value;

    public T getValue(){
        return value;
    }

    public void setValue(T value){
        this.value = value;
    }

    public static void main(String[] args) {
        GenericsType<String> type = new GenericsType<>();
        type.setValue("Dara");
        String st = type.getValue();
        System.out.println(st);

        GenericsType<Integer> type1 = new GenericsType<>();
        type1.setValue(100);
        Integer st1 = type1.getValue();
        System.out.println(st1);
    }
}
