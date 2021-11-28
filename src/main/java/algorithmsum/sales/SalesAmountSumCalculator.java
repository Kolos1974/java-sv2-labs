package algorithmsum.sales;

import java.util.List;

public class SalesAmountSumCalculator {


    public int sumSalesAmount(List<Salesperson> salespersons) {
        int result = 0;
        for (Salesperson sp : salespersons){
            result += sp.getAmount();
        }
        return result;
    }
}
