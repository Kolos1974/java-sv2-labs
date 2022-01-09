package exceptionclass.bank;

public class Account {
    private String accountNumber;
    private double balance;
    private double maxSubtract;

    public Account(String accountNumber, double balance) {
        if (accountNumber==null){
            throw new IllegalArgumentException("Account number should not be null!");
        }
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.maxSubtract = 100000;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public double getMaxSubtract() {
        return maxSubtract;
    }

    public void setMaxSubtract(double maxSubtract) {
        if (maxSubtract<0){
            throw new InvalidAmountBankOperationException("Invalid amount!");
        }

        this.maxSubtract = maxSubtract;
    }

    public double subtract(double amount) {
        if (amount > maxSubtract) {
            throw new InvalidAmountBankOperationException("Low balance!");
        }
        if (amount < 0){
            throw new InvalidAmountBankOperationException("Invalid amount!");
        }

        if (balance<amount){
            throw new LowBalanceBankOperationException("Low balance!");
        }
        balance = balance - amount;
        return balance;
    }

    public double deposit(double amount){
        if (amount < 0){
            throw new InvalidAmountBankOperationException("Invalid amount!");
        }
        balance = balance + amount;
        return balance;
    }

}
