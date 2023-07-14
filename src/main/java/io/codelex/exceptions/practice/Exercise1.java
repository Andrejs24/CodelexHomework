package io.codelex.exceptions.practice;

import java.util.Scanner;

public class Exercise1 {
    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Enter the numerator :");
            String numerator = scanner.nextLine();
            if (numerator.startsWith("q") || numerator.startsWith("Q"))
                break;
            try {
                int numeratorInteger = Integer.parseInt(numerator);

                System.out.print("Enter the divisor: ");
                int divisor = scanner.nextInt();
                scanner.nextLine();

                System.out.println(numeratorInteger + " / " + divisor + " = " + (numeratorInteger / divisor));
            } catch (NumberFormatException e) {
                System.out.println("You entered bad data. Please try again.");
            } catch (ArithmeticException e) {
                System.out.println("You can't divide " + numerator + " by 0");
            }
        }
    }

}
