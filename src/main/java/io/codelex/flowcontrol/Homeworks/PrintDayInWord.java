package io.codelex.flowcontrol.Homeworks;

import java.util.Scanner;

public class PrintDayInWord {

    public static void main(String[] args) {
        System.out.println("Please enter day of week as a number: ");
        Scanner scanner = new Scanner(System.in);
        if ((scanner.hasNextInt())) {
            int day = scanner.nextInt();
findDayOfWeek(day);
        }
        else System.out.println("Not a valid day");
    }
        public static void findDayOfWeek ( int number){
            switch (number) {
                case 1 -> System.out.println("Monday");
                case 2 -> System.out.println("Tuesday");
                case 3 -> System.out.println("Wednesday");
                case 4 -> System.out.println("Thursday");
                case 5 -> System.out.println("Friday");
                case 6 -> System.out.println("Saturday");
                case 7 -> System.out.println("Sunday");
                default -> System.out.println("Not a valid day");

            }
        }


    }

