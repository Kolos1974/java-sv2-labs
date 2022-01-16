package inheritancemethods.cars;

public class Car {
    private double fuelRate;
    private double fuel;
    private double tankCapacity;

    public Car(double fuelRate, double fuel, double tankCapacity) {
        if (fuel > tankCapacity) {
            throw new IllegalArgumentException("Tank capacity is less than fuel!");
        }
        this.fuelRate = fuelRate;
        this.fuel = fuel;
        this.tankCapacity = tankCapacity;
    }

    public void modifyFuelAmount(double fuel){
        this.fuel += fuel;
    }

    public void drive(int km){
        if (!isEnoughFuel(km)) {
            throw new IllegalArgumentException("Not enough fuel available!");
        }
        fuel -= fuelRate*(km/100.0);
    }

    public double calculateRefillAmount(){
        return tankCapacity-fuel;
    }

    private boolean isEnoughFuel(int distance) {
        return (fuel - distance * fuelRate / 100) >= 0.0;
    }

    public double getFuelRate() {
        return fuelRate;
    }

    public double getFuel() {
        return fuel;
    }

    public double getTankCapacity() {
        return tankCapacity;
    }
}
