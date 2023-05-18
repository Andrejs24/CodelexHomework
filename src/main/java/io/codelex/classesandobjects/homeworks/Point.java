package io.codelex.classesandobjects.homeworks;

public class Point {
    private int x;
    private int y;
    private static int z1;
    private static int z2;


    public static void swapPoints(Point point1, Point point2) {
        z1 = point1.x;
        z2 = point1.y;
        point1.x = point2.x;
        point1.y = point2.y;

        point2.x = z1;
        point2.y = z2;

    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }


}
