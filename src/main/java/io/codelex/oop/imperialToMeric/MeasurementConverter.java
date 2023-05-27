package io.codelex.oop.imperialToMeric;

public class MeasurementConverter {

    public int convertValue(int value, ConversionType type) {
        switch (type) {
            case METERS_TO_YARDS -> {
                return (int) (value * 1.093);
            }
            case YARDS_TO_METERS -> {
                return (int) (value * 0.9144);
            }
            case CENTIMETERS_TO_INCHES -> {
                return (int) (value * 0.3937);
            }
            case INCHES_TO_CENTIMETERS -> {
                return (int) (value * 2.54);
            }
            case KILOMETERS_TO_MILES -> {
                return (int) (value * 0.6213);
            }
            case MILES_TO_KILOMETERS -> {
                return (int) (value * 1.609);
            }
            default -> throw new IllegalArgumentException("Looks like you entered some wrong inputs...");
        }
    }


}
