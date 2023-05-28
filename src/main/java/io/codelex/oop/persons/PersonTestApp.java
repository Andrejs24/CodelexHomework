package io.codelex.oop.persons;

import java.time.LocalDate;

public class PersonTestApp {
    public static void main(String[] args) {

        Customer customer1 = new Customer("Bob", "Takerson", "1985", 29, "0005", 14);
        Customer customer2 = new Customer("Kristin", "Washington", "1978", 18, "0004", 55);

        Employee employee1 = new Employee("Tom", "Taker", "1996", 34, "Accountant", LocalDate.of(2019, 03, 15));
        Employee employee2 = new Employee("Sarah", "Simson", "1987", 21, "Manager", LocalDate.of(2021, 07, 21));
        System.out.println("Information about customers :");
        System.out.println(customer1.getInfo());
        System.out.println();
        System.out.println(customer2.getInfo());
        System.out.println();
        System.out.println("Information about employees :");
        System.out.println(employee1.getInfo());
        System.out.println();
        System.out.println(employee2.getInfo());


    }
}
