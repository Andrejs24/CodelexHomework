package io.codelex.oop.shapes;

public class ThreeDShapeTestApp {
    public static void main(String[] args) {


        Qube qube = new Qube(6, 15);
        Cone cone = new Cone(1, 15, 8);

        System.out.println("Expected result of qube area with side 15 is : 1350");
        System.out.println("The result is : " + qube.getArea());
        System.out.println("Expected result of qube perimeter with side 15 is : 180");
        System.out.println("The result is : " + qube.getPerimeter());
        System.out.println("Expected result of qube volume with side 15 is :3375");
        System.out.println("The result is : " + qube.calculateVolume());
        System.out.println();
        System.out.println("Expected result of cone area with radius 15 and height 8 is : 1507");
        System.out.println("The result is : " + cone.getArea());
        System.out.println("Expected result of cone perimeter with radius 15 and height 8 is : 94");
        System.out.println("The result is : " + cone.getPerimeter());
        System.out.println("Expected result of cone volume with radius 15 and height 8 is : 1884");
        System.out.println("The result is : " + cone.calculateVolume());


    }
}
