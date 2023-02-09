public class Task9 {
    public static void main(String[] args) {
        int number;
        String ruble = null;
        for (number = 0; number < 100; number++) {
            switch (number % 10) {
                case 0:
                case 5:
                case 6:
                case 7:
                case 8:
                case 9:
                    ruble = " рублей";
                    break;
                case 1:
                    ruble = " рубль";
                    break;
                case 2:
                case 3:
                case 4:
                    ruble = " рубля";
                    break;
                default:
                    ruble = " не является денежной величиной";
            }
            if (number > 10 && number < 20) {
                ruble = " рублей";
            }
            System.out.println(number + ruble);
        }
    }
}
