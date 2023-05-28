package io.codelex.oop.imperialToMeric;

public class MeasurementConverter {

    public int convertValue(int value, ConversionType type) {
        switch (type) {
            case METERS_TO_YARDS -> {
                return (int) (value * ConversionType.METERS_TO_YARDS.getParameter());
            }
            case YARDS_TO_METERS -> {
                return (int) (value * ConversionType.YARDS_TO_METERS.getParameter());
            }
            case CENTIMETERS_TO_INCHES -> {
                return (int) (value * ConversionType.CENTIMETERS_TO_INCHES.getParameter());
            }
            case INCHES_TO_CENTIMETERS -> {
                return (int) (value * ConversionType.INCHES_TO_CENTIMETERS.getParameter());
            }
            case KILOMETERS_TO_MILES -> {
                return (int) (value * ConversionType.KILOMETERS_TO_MILES.getParameter());
            }
            case MILES_TO_KILOMETERS -> {
                return (int) (value * ConversionType.MILES_TO_KILOMETERS.getParameter());
            }
            default -> throw new IllegalArgumentException("Looks like you entered some wrong inputs...");

        }


    }
}
