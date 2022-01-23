package interfacedefaultmethods.seats;

public interface Seat {

    public default  int getNumberOfSeats(){
        return 5;
    }

}
