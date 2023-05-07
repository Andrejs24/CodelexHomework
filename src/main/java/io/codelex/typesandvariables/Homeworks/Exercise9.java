package io.codelex.typesandvariables.Homeworks;

import java.util.Scanner;

public class Exercise9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter distance in meters");
        double distance = scanner.nextDouble();
        System.out.print("Enter time in hours: ");
        int hours = scanner.nextInt();
        System.out.print("Enter time in minutes: ");
        int minutes = scanner.nextInt();
        System.out.print("Enter time in seconds: ");
        int seconds = scanner.nextInt();
        int timeInSeconds = (hours * 3600) + (minutes * 60) + seconds;
        double speedInMps = distance / timeInSeconds;
        double speedInKph = (distance / 1000.0) / (timeInSeconds / 3600.0);
        double speedInMph = (distance / 1609.0) / (timeInSeconds / 3600.0);
        System.out.println("Speed in meters/second: " + speedInMps);
        System.out.println("Speed in kilometers/h: " + speedInKph);
        System.out.println("Speed in miles/h: " + speedInMph);
    }
}


