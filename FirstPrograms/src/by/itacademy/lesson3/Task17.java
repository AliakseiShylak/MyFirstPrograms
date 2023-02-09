// Для целых чисел, которые делятся на 7 в диапазоне от 1 до 100, вывести на экран строку “Hope!”.
public class Task17 {
    public static void main(String[] args) {
        int beginRange = 1;
        int endRange = 100;
        int divisor = 7;
        int start = beginRange;
        while (start % divisor != 0) {
            start++;
        }
        if (start > endRange) {
            System.out.println("There are no numbers in the given range that are divisible by " + divisor);
        } else {
            for (int i = start; i <= endRange; i += divisor) {
                System.out.println(i + " Hope!");
            }
        }
    }
}
