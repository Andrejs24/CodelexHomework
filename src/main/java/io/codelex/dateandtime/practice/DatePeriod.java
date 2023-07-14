package io.codelex.dateandtime.practice;

import java.time.LocalDate;

public class DatePeriod {

    private static LocalDate startDate;
    private static LocalDate endDate;

    public static LocalDate getStartDate() {
        return startDate;
    }

    public static LocalDate getEndDate() {
        return endDate;
    }

    public DatePeriod(LocalDate startDate, LocalDate endDate) {
        this.startDate = startDate;
        this.endDate = endDate;
    }

    public static DatePeriod intersection(DatePeriod datePeriod) {

        if (datePeriod.startDate.isAfter(endDate) || datePeriod.getEndDate().isBefore(startDate)) {
            return null;
        }

        LocalDate intersectionStart = startDate.isBefore(datePeriod.getStartDate()) ? datePeriod.getStartDate() : startDate;
        LocalDate intersectionEnd = endDate.isAfter(datePeriod.getEndDate()) ? datePeriod.getEndDate() : endDate;

        return new DatePeriod(intersectionStart, intersectionEnd);
    }


    public static void displayStartAndEndDates() {
        System.out.println("Start day is : " + startDate + ". End day is : " + endDate);
    }


}

