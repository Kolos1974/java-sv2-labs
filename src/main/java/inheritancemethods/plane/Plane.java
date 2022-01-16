package inheritancemethods.plane;

public class Plane {
    public static void main(String[] args) {
        Passenger passenger = new Passenger("Normál utas", 15000);
        PriorityPassenger priorityPassenger = new PriorityPassenger("Elsőbbségi utas", 15000, 120);
        FirstClassPassenger firstClassPassenger = new FirstClassPassenger("Első osztályos utas", 22000, 136 );

        System.out.println(passenger.getName()+" "+passenger.getPriceOfPlaneTicket());
        System.out.println(priorityPassenger.getName()+" "+priorityPassenger.getPriceOfPlaneTicket());
        System.out.println(firstClassPassenger.getName()+" "+firstClassPassenger.getPriceOfPlaneTicket());

    }

}
