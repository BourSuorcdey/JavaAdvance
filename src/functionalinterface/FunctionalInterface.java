package functionalinterface;

import functionalinterface.AddNumber;

public class FunctionalInterface {
    // Java concept OOP :
    // Inheritance
    // Polymorphism
    // Abstraction
    // Encapsulation

    // Interface:
    // Method without logic code (Nobody)
    public static void main(String[] args) {
        AddNumber addThree = new MyAddThree();
        Integer result = addThree.add(5);
        System.out.println(result);

        AddNumber add30 = new AddNumber() {
            @Override
            public Integer add(int number) {
                return number + 30;
            }
        };
        System.out.println(add30.add(10));

        AddNumber add10 = number -> number + 20;
        System.out.println(add10.add(50));


        // Functional interface can be implemented by lambda
    }
}
