/*
 * Создайте класс с именем fraction, содержащий два поля типа int - числитель и знаменатель обыкновенной дроби.
 * Конструктор класса должен инициализировать их заданным набором значений.
 * Создайте метод класса, который будет выводить дробь в текстовую строку в формате x / y;
 * метод, добавляющий (сложение) к текущей дроби дробь, переданную ему в параметре и возвращающий дробь - результат сложения;
 * метод, умножающий (произведение) текущую дробь на число типа double, переданное ему в параметре
 * и возвращающий дробь - результат умножения;
 * метод, делящий (деление) текущую дробь на число типа double, переданное ему в параметре
 * и возвращающий дробь - результат деления.
 */

package by.itacademy.lesson5;

public class Fraction {
    private int numerator;
    private int denominator;

    public Fraction(int numerator, int denominator) {
        if (denominator != 0) {
            if (denominator < 0) {
                this.numerator = -numerator;
            } else {
                this.numerator = numerator;
            }
            this.denominator = Math.abs(denominator);
        }
    }

    public String getFraction() {
        return this.numerator + " / " + this.denominator;
    }

    public void reduceFraction() {
        int number = 2;
        int sign = 1;
        int min;
        if (this.numerator < 0) {
            sign = -1;
            this.numerator = -this.numerator;
        }
        min = Math.min(this.numerator, this.denominator);
        while (number <= min / number) {
            while (this.numerator % number == 0 && this.denominator % number == 0) {
                this.numerator /= number;
                this.denominator /= number;
            }
            number++;
        }
        if (sign == -1) {
            this.numerator = -this.numerator;
        }
        return;
    }

    public int calculateNOK(int a, int b) {
        int nok = 1;
        int number = 2;
        while (number <= Math.min(a, b)) {
            while (a % number == 0 || b % number == 0) {
                nok *= number;
                if (a % number == 0) {
                    a /= number;
                }
                if (b % number == 0) {
                    b /= number;
                }
            }
            number++;
        }
        return nok * a * b;
    }

    public void addFraction(Fraction fraction) {
        int nokOfDenominator = calculateNOK(this.denominator, fraction.denominator);
        this.numerator = this.numerator * nokOfDenominator / this.denominator +
                fraction.numerator * nokOfDenominator / fraction.denominator;
        this.denominator = nokOfDenominator;
        reduceFraction();
        return;
    }

    public void myltiplyByDouble(double number) {
        int counter = 0;
        while (number % 10 != 0) {
            number *= 10;
            counter++;
        }
        this.numerator *= number;
        this.denominator *= Math.pow(10, counter);
        reduceFraction();
        return;
    }

    public void dividelyByDouble(double number) {
        int counter = 0;
        while (number % 10 != 0) {
            number *= 10;
            counter++;
        }
        this.numerator *= Math.pow(10, counter);
        if (number < 0) {
            this.numerator = -this.numerator;
        }
        this.denominator *= Math.abs(number);
        reduceFraction();
        return;
    }

    public static void main(String[] args) {
        Fraction f1 = new Fraction(54, -567);
        Fraction f2 = new Fraction(1, 3);
        double decimalFraction = 1.75;

        System.out.println("f1 = " + f1.getFraction());
        System.out.println("f2 = " + f2.getFraction());

        f1.addFraction(f2);
        System.out.println("f1 + f2 = " + f1.getFraction());

        System.out.print(f1.getFraction() + " * " + decimalFraction + " = ");
        f1.myltiplyByDouble(decimalFraction);
        System.out.println(f1.getFraction());

        System.out.print(f2.getFraction() + "  /  " + decimalFraction + " = ");
        f2.dividelyByDouble(decimalFraction);
        System.out.println(f2.getFraction());
    }
}