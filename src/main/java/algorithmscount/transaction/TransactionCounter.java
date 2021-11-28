package algorithmscount.transaction;

import java.util.List;

public class TransactionCounter {


    public int countEntryLessThan(List<Transaction> transactions, int limit) {
        int result = 0;
        for (Transaction element : transactions){
            if (element.isCredit() && element.getAmount()<limit){
                result++;
            }
        }
        return result;
    }
}
