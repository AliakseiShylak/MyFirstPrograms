/*
 * Задать произвольное целое число и вывести его в бухгалтерском формате, то
 * есть, начиная справа, каждые три позиции отделяются пробелом.
 * Например, число 20023143 должно быть выведено как 20 023 143.
 */
public class Task18 {
    public static void main(String[] args) {
        int number = -20023143;
        int counter = 0;
        int temp = number;
        String sign = "";

        if (number == 0) {
            System.out.println(number);
            return;
        }
        if (number < 0) {
            sign = "-";
            number = -number;
        }
        while (temp != 0) {
            temp /= 10;
            counter++;
        }
        System.out.print(sign);
        while (counter > 0) {
            temp = number - (number / (int) (Math.pow(10, counter - 1))) * (int) (Math.pow(10, counter - 1));
            System.out.print((number - temp) % ((int) (Math.pow(10, counter))) / ((int) (Math.pow(10, counter - 1))));
            counter--;
            if (counter % 3 == 0 && counter != 0) {
                System.out.print(" ");
            }
        }
    }
}
