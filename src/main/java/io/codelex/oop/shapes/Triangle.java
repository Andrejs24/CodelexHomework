package io.codelex.oop.shapes;

public class Triangle extends Shape {

    private int width;
    private int height;

    public Triangle(int numSides, int width, int height) {
        super(numSides);
        this.width = width;
        this.height = height;
    }

    public Triangle(int numSides) {
        super(numSides);
    }

    @Override
    public int getArea() {
        return (width * height) / 2;
    }

    @Override
    public int getPerimeter() {
        return (width + height + (int) (Math.sqrt(Math.pow(width, 2) + Math.pow(height, 2))));
    }
}
