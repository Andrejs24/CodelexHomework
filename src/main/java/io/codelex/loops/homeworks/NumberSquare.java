package io.codelex.loops.homeworks;

import java.util.Scanner;

public class NumberSquare {
    public static void main(String[] args) {
        System.out.println("Please enter your max number : ");
        Scanner scanner = new Scanner(System.in);
        int max = scanner.nextInt();
        System.out.println("Please enter your min number : ");
        int min = scanner.nextInt();
        for (int i = min; i <= max; i++) {
            for (int j = i; j <= max; j++) {
                System.out.print(j);
            }

            for (int j = min; j < i; j++) {
                System.out.print(j);
            }

            System.out.println();
        }
    }
}
