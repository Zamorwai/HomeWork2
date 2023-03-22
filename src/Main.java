public class Main {
    public static void main(String[] args) {

        byte month = 0;
        double money = 1000.0;

        double needToSaveUp = 14_000;
        double perMonth = 2500;
        double percent = (0.05 / 12 * 100)/100.0;

        while (money < needToSaveUp) {
            month++;
            money += money * percent + perMonth;
        }

        System.out.println("Потребуется " + month + " месяцев");
        System.out.println("Счет будет равен " + money);
    }
}