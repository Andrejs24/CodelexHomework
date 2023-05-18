package io.codelex.loops.homeworks;

import java.util.Scanner;

public class Exercise5Loops {
    public static void main(String[] args) {
        System.out.println("Please enter first word:");
        Scanner scanner = new Scanner(System.in);
        String word1 = scanner.nextLine();
        System.out.println("Please enter second word: ");
        String word2 = scanner.nextLine();
        String dot = ".";
        int dots = 0;
        for (int i = 0; i < 30; i++) {
            dots++;
        }
        System.out.println(word1 + dot.repeat(dots - word1.length() - word2.length()) + word2);

    }
}
