/*
 * a) Вывести последнюю цифру числа
 * b) Найти сумму цифр ab + cd числа abcd
 * c) Вывести 3юю цифру 5ти-значного числа
 */

package by.itacademy.lesson2;

import java.util.Random;

public class AdditonalTask1 {
    public static void main(String[] args) {
        Random random = new Random();
        int abcd = random.nextInt(9000) + 1000;
        int abcde = random.nextInt(90000) + 10000;

        System.out.println("Last digit of number " + abcd + " is " + abcd % 10);
        System.out.println("For nummber " + abcd + " ab + cd = " + (abcd / 100 + abcd % 100));
        System.out.println("Third digit of number " + abcde + " is " + abcde % 1000 /100);

    }
}
