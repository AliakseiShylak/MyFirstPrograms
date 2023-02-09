public class Task11 {
    public static void main(String[] args) {
        double a = 10;
        double b = 8;
        double c = 12.5;
        double d = 9.6;
        double e = 17.5;
        double f = 30;
        if (min(a, b) + min(c, d) <= min(e, f) && max(a, b) + max(c, d) <= max(e, f)) {
            System.out.println("yes");
        } else {
            System.out.println("no");
        }
    }
    public static double min(double x, double y) {
        return x < y ? x : y;
    }
    public static double max(double x, double y) {
        return x > y ? x : y;
    }
}
