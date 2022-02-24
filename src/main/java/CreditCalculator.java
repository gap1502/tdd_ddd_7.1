public class CreditCalculator {

    public static void main(String[] args) {

        int summa = 1_000_000;
        double percent = 8.2;
        int period = 36;

        CreditCalculator calculator = new CreditCalculator();

        System.out.println("Ежемесячный платеж равен " + calculator.monthPay(summa, percent, period) + " руб.");
        System.out.println("Общая сумма к возврату в банк " + calculator.totalAmount(summa, percent, period) + " руб.");
        System.out.println("Переплата за весь период " + calculator.overPay(summa, percent, period) + " руб.");
    }

    public int monthPay(int summa, double percent, int period) {
        double mothPercent = (percent / 12) / 100;
        double annuityPay = mothPercent * (Math.pow(1 + mothPercent, period)) / ((Math.pow(1 + mothPercent, period)) - 1);
        return (int) (summa * annuityPay);
    }

    public int totalAmount(int summa, double percent, int period) {
        double mothPercent = (percent / 12) / 100;
        double annuityPay = mothPercent * (Math.pow(1 + mothPercent, period)) / ((Math.pow(1 + mothPercent, period)) - 1);
        return (int) ((summa * annuityPay) * period);
    }

    public int overPay(int summa, double percent, int period) {
        double mothPercent = (percent / 12) / 100;
        double annuityPay = mothPercent * (Math.pow(1 + mothPercent, period)) / ((Math.pow(1 + mothPercent, period)) - 1);
        return (int) ((summa * annuityPay) * period - summa);
    }
}
