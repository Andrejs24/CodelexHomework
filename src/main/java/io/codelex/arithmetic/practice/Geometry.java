package io.codelex.arithmetic.practice;


import java.math.BigDecimal;

class Geometry {
    static double areaOfCircle(BigDecimal radius) {
        if (radius.compareTo(BigDecimal.ZERO) > 0) {
            BigDecimal area = radius.pow(2).multiply(new BigDecimal(Math.PI));
            return area.doubleValue();
        } else System.out.println("There can`t be negative value for radius!");
        return 0.0;
    }

    static double areaOfRectangle(BigDecimal length, BigDecimal width) {
        if (length.compareTo(BigDecimal.ZERO) > 0 && width.compareTo(BigDecimal.ZERO) > 0) {
            BigDecimal area = length.multiply(width);
            return area.doubleValue();
        } else System.out.println("Some of your entered values are less then 0 it`s not appropriated");
        return 0.0;
    }

    static double areaOfTriangle(BigDecimal base, BigDecimal h) {
        if (base.compareTo(BigDecimal.ZERO) > 0 && h.compareTo(BigDecimal.ZERO) > 0) {
            BigDecimal half = new BigDecimal(0.5);
            BigDecimal area = (base.multiply(h)).multiply(half);
            return area.doubleValue();
        } else System.out.println("Some of your entered values are less then 0 it`s not appropriated");
        return 0.0;
    }
}
