package io.codelex.flowcontrol.homeworks;

import java.util.Scanner;

public class PhoneKeyPad {
    public static void main(String[] args) {
        System.out.println("Enter your text: ");
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();
        convertToNumbers(text.toLowerCase());
    }

    public static void convertToNumbers(String text) {
        for (int i = 0; i < text.length(); i++) {
            char c = text.charAt(i);
            String stringOfNumbers = "";
            switch (c) {
                case 'a', 'b', 'c' -> stringOfNumbers += "2";
                case 'd', 'e', 'f' -> stringOfNumbers += "3";
                case 'g', 'h', 'i' -> stringOfNumbers += "4";
                case 'j', 'k', 'l' -> stringOfNumbers += "5";
                case 'm', 'n', 'o' -> stringOfNumbers += "6";
                case 'p', 'q', 'r', 's' -> stringOfNumbers += "7";
                case 't', 'u', 'v' -> stringOfNumbers += "8";
                case 'w', 'x', 'y', 'z' -> stringOfNumbers += "9";
            }
            System.out.print(stringOfNumbers);


        }

    }

}


