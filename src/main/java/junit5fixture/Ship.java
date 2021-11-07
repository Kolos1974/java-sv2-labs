package junit5fixture;

public class Ship {
    private String name;
    private int yearOfConstuctions;
    private double length;

    public Ship(String name, int yearOfConstuctions, double length) {
        this.name = name;
        this.yearOfConstuctions = yearOfConstuctions;
        this.length = length;
    }

    public String getName() {
        return name;
    }

    public int getYearOfConstuctions() {
        return yearOfConstuctions;
    }

    public double getLength() {
        return length;
    }

}
