package io.codelex.polymorphism.practice.exercise3;

public class Program {
    public static void main(String[] args) {
        Student student = new Student("Bob", "Marley", "First street 45", 123, 25.99);
        Employee employee = new Employee("John", "Smith", "Second Street 54", 321, "Manager");

        student.display();
        employee.display();
    }
}
