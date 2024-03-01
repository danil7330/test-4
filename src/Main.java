public class Main {
    public static void main(String[] args) {
        int myScore = 300;
        int replen = 4000;
        int myBonus = replen / 100;
        int balanceBonus = myScore + replen + myBonus;
        int myBalance = myScore + replen;
        if (replen >= 1000) {
            System.out.println("Итоговый счет=" + balanceBonus);
        } else {
            System.out.println("Итоговый счет=" + myBalance);
        }


    }
}
