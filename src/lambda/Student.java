package lambda;

public class Student {
    private String name;
    private String gender;
    private int age;

    public Student(String name, String gender, int age){
        super();
        this.name = name;
        this.gender = gender;
        this.age = age;
    }

    @Override
    public String toString(){
        return "Student [name: " + name + ", gender:" + gender + ", age: " + age + "]";
    }
}
