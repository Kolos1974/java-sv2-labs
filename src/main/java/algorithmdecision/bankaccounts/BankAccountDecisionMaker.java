package algorithmdecision.bankaccounts;

import java.util.List;

public class BankAccountDecisionMaker {

    public boolean containsBalanceGreatherThan(List<BankAccount> accounts, int min){
        boolean result = false;
        for (BankAccount bankAccount : accounts){
            if (bankAccount.getBalance()>min){
                result = true;
                break;
            }
        }
        return result;
    }
}
