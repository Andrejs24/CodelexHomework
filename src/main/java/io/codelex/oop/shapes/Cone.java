package io.codelex.oop.shapes;

public class Cone extends ThreeDShape {

    private int radius;
    private int height;


    public Cone(int numSides, int radius, int height) {
        super(numSides);
        this.radius = radius;
        this.height = height;
    }

    public Cone(int numSides) {
        super(numSides);
    }

    public int getRadius() {
        return radius;
    }

    public int getHeight() {
        return height;
    }

    @Override
    public int getArea() {
        double slantHeight = Math.sqrt(radius * radius + height * height);
        double baseArea = Math.PI * radius * radius;
        double lateralArea = Math.PI * radius * slantHeight;
        return (int) (baseArea + lateralArea);
    }

    @Override
    public int getPerimeter() {
        return (int) (2 * Math.PI * radius);
    }

    @Override
    public int calculateVolume() {
        return (int) ((Math.PI * radius * radius * height) / 3);

    }

}
