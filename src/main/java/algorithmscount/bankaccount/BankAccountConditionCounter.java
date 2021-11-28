package algorithmscount.bankaccount;

import java.util.List;

public class BankAccountConditionCounter {


    public int countWithBalanceGreaterThan(List<BankAccount> bankAccounts, int limit) {
        int result = 0;
        for (BankAccount element : bankAccounts){
            if (element.getBalance()>limit) {
                result++;
            }
        }
        return result;
    }
}
