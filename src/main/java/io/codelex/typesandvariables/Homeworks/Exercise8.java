package io.codelex.typesandvariables.Homeworks;

import java.util.Scanner;

public class Exercise8 {
    public static void main(String[] args) {
        System.out.println("Enter a value of minutes");
        Scanner scanner = new Scanner(System.in);
        int minutes = scanner.nextInt();
        convertInto(minutes);

    }
    public static void convertInto(int a){
        long hours = a / 60;
        long days = hours / 24;
        long years = days / 365;
        days = days % 365;

        System.out.println(a+ " minutes is approximately " + years + " years and " + days + " days.");
    }

}
