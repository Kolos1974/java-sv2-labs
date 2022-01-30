package sorting;

public class Car {
    private String brand;
    private int madeYear;
    private int price;

    public Car(String brand, int madeYear, int price) {
        this.brand = brand;
        this.madeYear = madeYear;
        this.price = price;
    }

    public String getBrand() {
        return brand;
    }

    public int getMadeYear() {
        return madeYear;
    }

    public int getPrice() {
        return price;
    }
}
