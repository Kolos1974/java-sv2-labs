package algorithmsum.transactions;

import java.util.List;

public class TransactionSumCalculator {

    public int sumAmountOfCreditEntries(List<Transaction> transactions){
        /*
        int result = 0;
        for (int i = 0; i <transactions.size(); i++){
            Transaction element = transactions.get(i);
            if (element.getTransactionOperation()==TransactionOperation.CREDIT) {
                result += element.getAmount();
            }
        }
        return result;
        */

        // Official:
        int sum = 0;
        for (Transaction transaction : transactions) {
            if (transaction.isCredit()) {
                sum += transaction.getAmount();
            }
        }
        return sum;
    }
}
