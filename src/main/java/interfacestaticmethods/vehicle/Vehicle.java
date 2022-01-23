package interfacestaticmethods.vehicle;

public interface Vehicle {

    public static Vehicle of(int numberOfWheels){
        if (numberOfWheels==2){
            return new Bicycle(numberOfWheels);
        }
        if (numberOfWheels==4){
            return new Car(numberOfWheels);
        }
        throw new IllegalStateException("This is neither a bicycle nor a car.");
    }
}
