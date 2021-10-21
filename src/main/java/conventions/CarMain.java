package conventions;

public class CarMain {

    public static void main(String[] args) {
        Car carFirst = new Car("Ford", "Petrol", 5, 5);
        Car carSecond = new Car("Saab", "Petrol",4,5);

        System.out.println("First car: "+carFirst.getCarType()+", enginetype: "+carFirst.getEngineType()+
                ", doors: "+carFirst.getDoors()+", persons: "+carFirst.getPersons());

        System.out.println("Second car: "+carSecond.getCarType()+", enginetype: "+carSecond.getEngineType()+
                ", doors: "+carSecond.getDoors()+", persons: "+carSecond.getPersons());

    }
}
