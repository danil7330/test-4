public class Main {
    public static void main(String[] args) {
        int score = 300;
        int replen = 4000;
        int bonus = replen / 500;
        int balancebonus = score + replen + bonus;
        int balance = score + replen;
        if (replen >= 1500) {
            System.out.println("Итоговый счет=" + balancebonus);
        } else {
            System.out.println("Итоговый счет=" + balance);
        }


    }
}
