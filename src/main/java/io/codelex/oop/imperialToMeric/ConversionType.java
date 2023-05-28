package io.codelex.oop.imperialToMeric;

public enum ConversionType {
    METERS_TO_YARDS(1.093),
    YARDS_TO_METERS(0.9144),
    CENTIMETERS_TO_INCHES(0.3937),
    INCHES_TO_CENTIMETERS(2.54),
    KILOMETERS_TO_MILES(0.6213),
    MILES_TO_KILOMETERS(1.609);

    private final double parameter;

    public double getParameter() {
        return parameter;
    }

    ConversionType(double parameter) {
        this.parameter = parameter;
    }
}
