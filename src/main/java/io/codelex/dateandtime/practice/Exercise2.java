package io.codelex.dateandtime.practice;

import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Pattern;

public class Exercise2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the date when server is launched in yyyy-MM-dd format : ");
        String dateServerIsLaunched = scanner.nextLine();
        System.out.println("Enter the year you need to check for updates : ");
        String yearNeedToCheckForUpdates = scanner.nextLine();
        System.out.println("Enter month you need to check for updates : ");
        String monthNeedToCheckForUpdates = scanner.nextLine();


        Pattern inputOnlyMonth = Pattern.compile("^[a-zA-Z]+$");
        Pattern inputFullDate = Pattern.compile("\\d{4}-\\d{2}-\\d{2}");
        Pattern inputOnlyEar = Pattern.compile("(\\d{4})");

        if (dateServerIsLaunched.matches(String.valueOf(inputFullDate)) && yearNeedToCheckForUpdates.matches(String.valueOf(inputOnlyEar)) && monthNeedToCheckForUpdates.matches(String.valueOf(inputOnlyMonth))) {
            LocalDate launchDate = LocalDate.parse(dateServerIsLaunched);
            int year = Integer.parseInt(yearNeedToCheckForUpdates);
            Month month = parseMonth(monthNeedToCheckForUpdates);


            List<LocalDate> updateDates = calculateUpdateDates(launchDate, year, month);

            System.out.println("Server update dates for " + month + " " + year + ":");
            for (LocalDate updateDate : updateDates) {
                System.out.println(updateDate);

            }
        } else System.out.println("Wrong input! PLease try again.");


    }


    public static List<LocalDate> calculateUpdateDates(LocalDate dateServerLaunched, int year, Month month) {

        List<LocalDate> updateDates = new ArrayList<>();

        LocalDate currentDate = dateServerLaunched.withYear(year).withMonth(month.getValue());

        while (currentDate.getMonth() == month) {
            updateDates.add(currentDate);
            currentDate = currentDate.plusDays(14);
        }

        return updateDates;
    }

    public static Month parseMonth(String input) {
        try {
            return Month.valueOf(input.toUpperCase());
        } catch (IllegalArgumentException e) {
            return null;
        }
    }

}

