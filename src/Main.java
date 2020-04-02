public class Main {
    public static void main(String[] args) {

        // для удобоства все суммы занесены в переменные, чтобы при изменении сумм, расчеты происходили верно

        long amountAccount = 487; //сумма счета клиента
        int amountAccrual = 100; //сумма, за которую начисляют бонусы (за каждые...)
        long bonusLimit = 1000; //сумма от которой происходит начисления
        long amountReplenishment = 1400; //сумма пополнения (может меняться)
        int bonusAmount = 1; // сумма , начисляемого бонуса (за каждые...)



        if (amountReplenishment < bonusLimit) {
            long totalNoBonus = amountReplenishment + amountAccount;
            System.out.println("Сумма счета без бонуса: " + totalNoBonus);

        } else {
            long totalBonus = amountReplenishment + (amountReplenishment / amountAccrual * bonusAmount) + amountAccount;
            System.out.println("Сумма счета с бонусом: " + totalBonus);
        }

    }
}
