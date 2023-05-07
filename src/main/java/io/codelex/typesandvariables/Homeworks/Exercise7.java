package io.codelex.typesandvariables.Homeworks;

import java.util.Scanner;

public class Exercise7 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        int count = 0;
        for (int i = 0; i < input.length(); i++) {
            if (Character.isUpperCase(input.charAt(i))) {
                count++;
            }
        }

        System.out.println("Number of uppercase letters: " + count);
    }
}
