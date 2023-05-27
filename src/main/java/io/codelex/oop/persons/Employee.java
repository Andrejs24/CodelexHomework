package io.codelex.oop.persons;

import java.time.LocalDate;
import java.time.Period;

public class Employee extends Person {

    private String position;
    private LocalDate startedWorking;

    public Employee(String firstName, String lastName, String iD, int age, String position, LocalDate startedWorking) {
        super(firstName, lastName, iD, age);
        this.position = position;
        this.startedWorking = startedWorking;
    }

    public Employee(String firstName, String lastName, String iD, int age) {
        super(firstName, lastName, iD, age);
    }

    @Override
    public String getInfo() {
        return getFirstName() + " " + getLastName() + " Position:" + position + " (" + getWorkExperience() + " years)";
    }

    public int getWorkExperience() {
        LocalDate today = LocalDate.now();
        Period period = Period.between(startedWorking, today);
        return period.getYears();
    }

}
