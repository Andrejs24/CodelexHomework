package io.codelex.oop.imperialToMeric;

public class ConversionTestApp {
    public static void main(String[] args) {

        MeasurementConverter measurementConverter = new MeasurementConverter();


        System.out.println(measurementConverter.convertValue(10, ConversionType.METERS_TO_YARDS));
        System.out.println();
        System.out.println(measurementConverter.convertValue(21, ConversionType.YARDS_TO_METERS));
        System.out.println();
        System.out.println(measurementConverter.convertValue(22, ConversionType.CENTIMETERS_TO_INCHES));
        System.out.println();
        System.out.println(measurementConverter.convertValue(133, ConversionType.INCHES_TO_CENTIMETERS));
        System.out.println();
        System.out.println(measurementConverter.convertValue(202, ConversionType.KILOMETERS_TO_MILES));
        System.out.println();
        System.out.println(measurementConverter.convertValue(647, ConversionType.MILES_TO_KILOMETERS));


    }


}
