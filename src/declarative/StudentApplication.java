package declarative;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StudentApplication {
    private static List<Student> students = List.of(
            new Student(1, "Dara", "M", 19),
            new Student(2, "Lika", "F", 18),
            new Student(3, "Kosoma", "F", 21),
            new Student(4, "Math", "M", 19),
            new Student(5, "Vannak", "M", 19),
            new Student(6, "Leo", "M", 20),
            new Student(7, "Celeka", "F", 19),
            new Student(8, "Bruno", "M", 18),
            new Student(9, "Kanha", "F", 21)
    );

    public static void main(String[] args) {
        System.out.println("Imperative");
        List<Student> list = getStudents(students);
//        for(Student s : list){
//            System.out.println(s);
//        }
        // Method reference
        list.forEach(System.out::println);

        System.out.println("Declarative");
        List<Student> l = getStudentsDeclarative(students);
//        for(Student v : l) {
//            System.out.println(v);
//        }
        // Method reference
        l.forEach(System.out::println);
    }

    // imperative
    public static List<Student> getStudents(List<Student> students) {
        List<Student> list = new ArrayList<>();
        int counter = 0;
        int limit = 3;
        for(Student st : students) {
            if(st.getGender().equals("F")){
                list.add(st);
                counter++;
            }
            if(counter == limit) {
                break;
            }
        }
        return list;
    }

    //Declarative
    public static List<Student> getStudentsDeclarative(List<Student> students) {
        return students.stream()
                .filter(d -> d.getGender().equals("F"))
                .limit(3)
                .collect(Collectors.toList());
    }
}
