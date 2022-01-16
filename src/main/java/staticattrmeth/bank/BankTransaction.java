package staticattrmeth.bank;

public class BankTransaction {
    private static final long MIN_TRANSACTION_VALUE = 1;
    private static final long MAX_TRANSACTION_VALUE = 10_000_000;
    private static long countOfTransactions;
    private static long sumOfTransactions;
    private static long currentMinValue;
    private static long currentMaxValue;

    private long transactionValue;

    public BankTransaction(long transactionValue) {
        if ((transactionValue<MIN_TRANSACTION_VALUE) || (transactionValue>MAX_TRANSACTION_VALUE)){
            throw new IllegalArgumentException("This transaction cannot be accepted! " + transactionValue);
        }
        this.transactionValue = transactionValue;
        countOfTransactions++;
        sumOfTransactions += transactionValue;
        if (currentMinValue>transactionValue){
            currentMinValue= transactionValue;
        }
        if (currentMaxValue<transactionValue){
            currentMaxValue=transactionValue;
        }

    }

    public static void initTheDay() {
        countOfTransactions = 0;
        sumOfTransactions = 0;
        currentMinValue = MAX_TRANSACTION_VALUE;
        currentMaxValue = MIN_TRANSACTION_VALUE;
    }


    public static long getAverageOfTransaction() {
        if (countOfTransactions > 0) {
            return sumOfTransactions / countOfTransactions;
        }
        return 0;
    }

    public static long getCurrentMinValue(){
        if (countOfTransactions> 0) {
            return currentMinValue;
        }
        return 0;
    }

    public static long getCurrentMaxValue(){
        if (countOfTransactions>0) {
            return currentMaxValue;
        }
        return 0;
    }

    public static long getSumOfTransactions(){
        return sumOfTransactions;
    }

    public long getTransactionValue(){
        return transactionValue;
    }

}
