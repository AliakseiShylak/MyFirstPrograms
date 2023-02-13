/*
 * Вывести длину отрезка, проходящей через две точки
 */

package by.itacademy.lesson2;

import java.util.Random;

public class Point {
    private int x;
    private int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public String printPoint() {
        return "(" + x + "; " + y + ")";
    }

    public static double getDistance(Point a, Point b) {
        return Math.sqrt(Math.pow(a.x - b.x, 2) + Math.pow(a.y - b.y, 2));
    }


    public static void main(String[] args) {
        Point a = new Point(4, 5);
        Point b = new Point(-2, 13);


        System.out.println("Distance between point " + a.printPoint() + " and point " + b.printPoint()
                            + " is " + Point.getDistance(a, b)) ;
    }
}