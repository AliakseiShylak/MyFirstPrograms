// Вычислить произведение чисел от 1 до 25 с помощью цикла do while.
public class Task14 {
    public static void main(String[] args) {
        double mult = 1;
        int i = 2;
        do {
            mult *= i;
            i++;
        } while (i <= 25);
        System.out.println(mult);
    }
}
