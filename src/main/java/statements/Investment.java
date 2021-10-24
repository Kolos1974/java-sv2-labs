package statements;

public class Investment {
    private double cost = 0.3;
    private int fund;
    private int interestRate;
    private boolean active;

    public Investment(int fund, int interestRate) {
        this.fund = fund;
        this.interestRate = interestRate;
        this.active = true;
    }

    public int getFund() {
        return fund;
    }

    public double getYield(int days){
        return ((fund*(interestRate/100.0))/365)*days;
    }

    public double close(int days){
        double yield = this.getYield(days);
//      double sum = this.fund+yield-(fund*(cost/100.0));
        double sum = this.fund+yield-((this.fund+yield)*(cost/100.0));
        double result = this.active ? sum : 0;
        this.active = false;
        return result;
    }
}
