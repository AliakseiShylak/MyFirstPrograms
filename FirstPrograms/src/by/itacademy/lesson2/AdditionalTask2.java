/*
 * Имеется прямоугольное отверстие размера a на b.
 * Определить можно ли полностью закрыть отверстие круглой картонкой радиусом r.
 */

package by.itacademy.lesson2;

public class AdditionalTask2 {
    public static void main(String[] args) {
        int a = 4;
        int b = 7;
        int r = 5;

        if (Math.pow(a, 2) + Math.pow(b, 2) <= Math.pow(2 * r, 2)) {
            System.out.println("Circle with radius " + r + " can cover rectangle " + a + " x " + b);
        } else {
            System.out.println("Circle with radius " + r + " can not cover rectangle " + a + " x " + b);
        }
    }
}
