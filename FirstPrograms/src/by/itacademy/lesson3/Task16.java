/*
 * Найти среди чисел от 50 до 70 второе простое число (число называют простым,
 * если оно делится без остатка только на 1 и себя) и завершить цикл с использованием break.
 */
public class Task16 {
    public static void main(String[] args) {
        int counter = 0;
        for (int i = 50; i <= 70; i++) {
            if (isPrimeNumber(i)) {
                counter++;
                if (counter == 2) {
                    System.out.println("Second prime number in the given range is " + i);
                    break;
                }
            }
        }
    }

    public static boolean isPrimeNumber(int number) {
        int i = 2;
        while (i <= number / i) {
            if (number % i == 0) {
                return false;
            }
            i++;
        }
        return true;
    }
}
