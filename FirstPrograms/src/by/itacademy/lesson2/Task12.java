public class Task12 {
    public static void main(String[] args) {
        int dayOfWeeks = 4;
        System.out.println(schedule(dayOfWeeks));
    }

    public static String schedule(int day) {
        String plan = null;
        switch (day) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                plan = "Надо идти на работу";
                break;
            case 6:
            case 7:
                plan = "Можно отдохнуть";
                break;
            default:
                plan = "Ошибка! Такого дня не существует. Выберитп другой день.";
        }
        return plan;
    }
}
