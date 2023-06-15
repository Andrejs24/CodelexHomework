package io.codelex.classesandobjects.homeworks;

public class PointSwaperTestsApp {
    public static void main(String[] args) {
        Point point1 = new Point(5, 2);
        Point point2 = new Point(-3, 6);

        Point.swapPoints(point1, point2);
        System.out.println("(" + point1.getX() + ", " + point1.getY() + ")");
        System.out.println("(" + point2.getX() + ", " + point2.getY() + ")");
    }
}
