package io.codelex.oop.shapes;

public class Qube extends ThreeDShape {
    private int side;

    public Qube(int numSides, int side) {
        super(numSides);
        this.side = side;
    }

    public Qube(int numSides) {
        super(numSides);
    }

    public int getSide() {
        return side;
    }

    @Override
    public int getArea() {
        return 6 * side * side;
    }

    @Override
    public int getPerimeter() {
        return 12 * side;
    }

    @Override
    public int calculateVolume() {
        return (int) Math.pow(side, 3);
    }
}
