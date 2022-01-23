package virtualmethod.vehicle;

public class Car extends Vehicle{
    protected int numberOfPassenger;

    public Car(int vehicleWeight, int numberOfPassenger) {
        super(vehicleWeight);
        this.numberOfPassenger = numberOfPassenger;
    }

    @Override
    public String toString() {
        return "Car{" +
                "numberOfPassenger=" + numberOfPassenger +
                ", vehicleWeight=" + getVehicleWeight() +
                '}';
    }

    @Override
    public int getGrossLoad() {
        return super.getGrossLoad()+numberOfPassenger*Vehicle.PERSON_AVERAGE_WEIGHT;
    }
}
