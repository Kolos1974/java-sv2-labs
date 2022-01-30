package sorting;

import java.util.Arrays;

public class Income {
    private int[] money;

    public int[] getMoney() {
        return money;
    }

    public Income(int[] money) {
        this.money = money;
    }

    public int getHighestIncome() {
        Arrays.sort(money);
        return money[money.length-1];
    }

    public static void main(String[] args) {
        Income income = new Income(new int[] {150000, 60000, 352000, 542000, 124000});

        System.out.println(income.getMoney());
        System.out.println(income.getHighestIncome());

    }

}
