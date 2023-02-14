/*
 * a) Вывести длину отрезка, проходящей через две точки
 * b) Вывести уравнение прямой, проходящей через две точки
 */

package by.itacademy.lesson2;

import by.itacademy.lesson5.Fraction;

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
        Point pointA = new Point(4, 5);
        Point pointB = new Point(2, 10);
        Fraction k, b;
        String sign = "";

        System.out.println("Distance between point " + pointA.printPoint() + " and point " + pointB.printPoint()
                + " is " + Point.getDistance(pointA, pointB));

        if (pointA.x == pointB.x) {
            System.out.println("Equation of a straight line: x = " + pointA.x);
            return;
        }
        if (pointA.y == pointB.y) {
            System.out.println("Equation of a straight line: y = " + pointA.y);
            return;
        }

        k = new Fraction(pointB.y - pointA.y, pointB.x - pointA.x);
        b = new Fraction(pointA.y * pointB.x - pointB.y * pointA.x, pointB.x - pointA.x);
        k.reduceFraction();
        b.reduceFraction();
        if (b.getNumerator() >= 0) {
            sign = "+ ";
        }
        System.out.println("Equation of a straight line: y = " + k.getFraction() + " * x " + sign + b.getFraction());
    }
}