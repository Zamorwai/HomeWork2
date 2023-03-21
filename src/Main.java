public class Main {
    public static void main(String[] args) {

        byte month = 0;
        double account = 1000.0;
        double price = 14_000.0;
        double stipend = 2500.0;
        double bankPercent = Math.round(5.0 / 12 * 100)/100.0;

        while (account < price) {

            month++;
            account += (stipend + account) * bankPercent;
//            account = month * bankPercent;
        }

        System.out.println("Потребуется " + month + " месяцев");
        System.out.println("Счет будет равен " + Math.round(account));
    }
}