package exceptionclass.bank;


import java.util.List;

public class Bank {
    private List<Account> accounts;

    public Bank(List<Account> accounts) {
        if (accounts== null) {
            throw new IllegalArgumentException("Account list should not be null!");
        }
        this.accounts = accounts;
    }

    public void payment(String account, double amount){
        if (!(isAccount(account))){
            throw new InvalidAccountNumberBankOperationException("Invalid account number!");
        }
        Account findAccount = findAccount(account);
        findAccount.subtract(amount);
    }

    public void deposit(String account, double amount){
            Account findAccount = findAccount(account);
            findAccount.deposit(amount);
    }

    public boolean isAccount(String accountNumber){
        boolean result = false;
        for (Account element : accounts ){
            if (element.getAccountNumber().equals(accountNumber)){
                result = true;
            }
        }
        return result;
    }

    public Account findAccount(String accountNumber){
        for (Account element : accounts ){
            if (element.getAccountNumber().equals(accountNumber)){
                return element;
            }
        }
        throw new InvalidAccountNumberBankOperationException("Invalid account number!");
    }

}
