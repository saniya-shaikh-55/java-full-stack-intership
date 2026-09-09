import java.util.*;

public class CoreJavaOOP {

    // Encapsulation
    static class Student {
        private String name;
        private int age;

        Student(String name, int age) {
            this.name = name;
            this.age = age;
        }

        public String getName() {
            return name;
        }

        public int getAge() {
            return age;
        }
    }

    // Inheritance
    static class Employee {
        void work() {
            System.out.println("Employee is working");
        }
    }

    static class Developer extends Employee {
        @Override
        void work() {
            System.out.println("Developer is writing Java code");
        }
    }

    public static void main(String[] args) {

        // OOP
        Student student = new Student("Saniya", 21);
        System.out.println("Name: " + student.getName());
        System.out.println("Age: " + student.getAge());

        // Collections Framework
        ArrayList<String> languages = new ArrayList<>();
        languages.add("Java");
        languages.add("Python");
        languages.add("SQL");

        System.out.println("Languages: " + languages);

        // Exception Handling
        try {
            int result = 10 / 0;
            System.out.println(result);
        } catch (ArithmeticException e) {
            System.out.println("Exception: Cannot divide by zero");
        }

        // Inheritance & Polymorphism
        Employee employee = new Developer();
        employee.work();
    }
}