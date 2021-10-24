package linebreak;

public class Car {

    public String getBrandAndTypeInSeparateLines(String brand, String type){
        return brand.toString()+System.lineSeparator()+type.toString();
    }

    public static void main(String[] args) {
        Car car = new Car();
        System.out.println(car.getBrandAndTypeInSeparateLines("Saab", "9.3"));
    }

}
