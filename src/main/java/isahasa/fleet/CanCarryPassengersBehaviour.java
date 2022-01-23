package isahasa.fleet;

public class CanCarryPassengersBehaviour implements CanCarryPassengers{
    private int passengers;
    private int maxPassengers;

    public CanCarryPassengersBehaviour(int maxPassengers) {
        this.maxPassengers = maxPassengers;
    }

    @Override
    public int loadPassenger(int passenger) {
        if (this.passengers + passenger > maxPassengers) {
            int rest = this.passengers+passenger-maxPassengers;
            this.passengers = maxPassengers;
            return rest;
        } else {
            this.passengers += passenger;
            return 0;
        }
    }

    @Override
    public int getPassengers() {
        return passengers;
    }
}
