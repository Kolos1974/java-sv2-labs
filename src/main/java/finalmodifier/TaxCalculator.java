package finalmodifier;

public class TaxCalculator {
    public static final int TAX_VALUE = 27;

    public static void main(String[] args) {
        TaxCalculator taxCalculator = new TaxCalculator();
        double price = 100000.10;
        System.out.println("A termék ára: "+price);
        System.out.println("A termék árának áfa értéke: "+taxCalculator.tax(price));
        System.out.println("A termék áfával növelt értéke: "+taxCalculator.priceWithTax(price));

    }

    public double tax(double price){
        return price*(TAX_VALUE/100.0);
    }

    public double priceWithTax(double price){
        return price+tax(price);
    }

}
