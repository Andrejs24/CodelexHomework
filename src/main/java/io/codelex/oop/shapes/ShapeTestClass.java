package io.codelex.oop.shapes;

public class ShapeTestClass {
    public static void main(String[] args) {

        Rectangle rectangle = new Rectangle(4, 4, 5);
        Triangle triangle = new Triangle(3, 12, 9);
        Hexagon hexagon = new Hexagon(6, 12);
        System.out.println("Expected result  of area = 20 ");
        System.out.println("Area of rectangle with width 4 and height 4 is :");
        System.out.println(rectangle.getArea());
        System.out.println("Expected result of perimeter = 18");
        System.out.println("Perimeter of rectangle with width 4 and height 4 is :");
        System.out.println(rectangle.getPerimeter());
        System.out.println("Expected result of triangle = 54");
        System.out.println("Area of triangle with width 12 and height 9 is :");
        System.out.println(triangle.getArea());
        System.out.println("Expected result = 36");
        System.out.println("Perimeter of triangle with width 12 and height 9 is:");
        System.out.println(triangle.getPerimeter());
        System.out.println("Expected result = 374");
        System.out.println("Area of hexagon with one side length 12 is: ");
        System.out.println(hexagon.getArea());
        System.out.println("Expected result = 12 ");
        System.out.println("Perimeter of hexagon with one side length 12 is :");
        System.out.println(hexagon.getPerimeter());


    }
}
