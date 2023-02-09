// Вычислить факториал целых чисел от 0 до 10 с помощью цикла while.
public class Task13 {
    public static void main(String[] args) {
        int i = 2;
        int factorial = 1;
        while (i <= 10) {
            factorial *= i;
            i++;
        }
        System.out.println(factorial);
    }
}
