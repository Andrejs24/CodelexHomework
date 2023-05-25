package io.codelex.oop.shapes;

public class ShapeTestClass {
    public static void main(String[] args) {

        Rectangle rectangle = new Rectangle(4, 4, 5);
        Triangle triangle = new Triangle(3, 12, 9);
        System.out.println(rectangle.getArea());
        System.out.println(rectangle.getPerimeter());
        System.out.println(triangle.getArea());
        System.out.println(triangle.getPerimeter());


    }
}
