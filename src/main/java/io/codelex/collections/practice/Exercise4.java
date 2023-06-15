package io.codelex.collections.practice;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Exercise4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter name: ");
        String input = scanner.nextLine();
        Set<String> names = new HashSet<>();

        while (!input.equals("")) {
            names.add(input);
            System.out.println("Enter name: ");
            input = scanner.nextLine();

        }
        System.out.println("List contains next names:" + names);

    }
}
