package io.codelex.dateandtime.practice;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.util.Scanner;

public class Exercise1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        LocalDate dateStarted;
        LocalDate dateFinished;


        System.out.println("Enter date you started  as yyyy-MM-dd please : ");
        String startDateStr = scanner.nextLine();
        System.out.println("Enter date you finished as yyyy-MM-dd please : ");
        String endDateStr = scanner.nextLine();

        dateStarted = LocalDate.parse(startDateStr);
        dateFinished = LocalDate.parse(endDateStr);
        long workDays = 0;

        while (!dateStarted.isAfter(dateFinished)) {
            if (isWorkDay(dateStarted)) {
                workDays++;
            }
            dateStarted = dateStarted.plusDays(1);
        }


        long totalhours = workDays * 8;
        System.out.println(totalhours);


    }

    public static boolean isWorkDay(LocalDate date) {
        if (date.getDayOfWeek() == DayOfWeek.SATURDAY || date.getDayOfWeek() == DayOfWeek.SUNDAY) {
            return false;
        }
        return true;
    }

}

