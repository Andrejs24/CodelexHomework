package io.codelex.oop.shapes;

public class Hexagon extends Shape {

    int sideLength;

    public Hexagon(int numSides, int sideLength) {
        super(numSides);
        this.sideLength = sideLength;
    }

    @Override
    public int getArea() {
        return (int) (((3 * Math.sqrt(3)) * (Math.pow(sideLength, 2))) / 2);
    }

    @Override
    public int getPerimeter() {
        return 6 * sideLength;
    }

}
