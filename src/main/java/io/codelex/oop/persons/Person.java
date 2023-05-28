package io.codelex.oop.persons;

public abstract class Person {

    private String firstName;

    private String lastName;
    private String iD;
    private int age;

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getiD() {
        return iD;
    }

    public int getAge() {
        return age;
    }

    public Person(String firstName, String lastName, String iD, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.iD = iD;
        this.age = age;
    }

    public abstract String getInfo();
}
