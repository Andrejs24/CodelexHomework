package io.codelex.arithmetic.HomeworkTasks;

public class Exercise8 {
    public static void main(String[] args) {
        calculateSalary(35, 7.50);
        calculateSalary(47, 8.20);
        calculateSalary(73, 10.00);
    }

    public static void calculateSalary(int hoursWorked, double basePay) {
        int overTime = 0;
        double baseSalary = 0;
        double overtimeSalary = 0;
        double totalSalary = 0;
        if (basePay > 8.00) {
            if (hoursWorked > 40 && hoursWorked < 60) {
                overTime = hoursWorked - 40;
                baseSalary = 40 * basePay;
                overtimeSalary = overTime * (basePay * 1.5);
                totalSalary = baseSalary + overtimeSalary;
            } else if (hoursWorked <= 40) {
                totalSalary = hoursWorked * basePay;
            } else if (hoursWorked > 60) {
                baseSalary = 40 * basePay;
                overtimeSalary = 20 * (basePay * 1.5);
                totalSalary = baseSalary + overtimeSalary;
            }
            System.out.println("This week you earn " + totalSalary);
        } else System.out.println("It can`t be less then 8.00$ for hour!");

    }
}
