package methodparam.sums;

public class Result {
    private Type type;
    private double amount;

    public Result(Type type, double amount) {
        this.type = type;
        this.amount = amount;
    }

    public Type getType() {
        return type;
    }

    public double getAmount() {
        return amount;
    }

    public void addAmount(double value){
        amount = amount+value;
    }
}
