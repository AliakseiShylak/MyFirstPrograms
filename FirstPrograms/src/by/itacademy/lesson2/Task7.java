public class Task7 {
    public static void main(String[] args) {
        int number = 707;
        System.out.println(lastDigit7(number) ? "yes" : "no");
    }
    public static boolean lastDigit7(int a) {
        return a % 10 == 7 ? true : false;
    }
}
