package io.codelex.typesandvariables.Homeworks;

import java.util.Scanner;

public class Exercise4 {
    public static void main(String[] args) {
        System.out.println("Enter please your full name");
        Scanner scanner = new Scanner(System.in);
        String fullName = scanner.nextLine();
        System.out.println("Enter your date of birth");
        Scanner scanner1 = new Scanner(System.in);
        int dateOfBirth = scanner1.nextInt();
        System.out.println("Hello my name is "+fullName+" and I born in "+dateOfBirth+ ".");
    }

}
