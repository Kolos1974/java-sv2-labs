package nestedclasses.thermo;

import java.util.ArrayList;
import java.util.List;

public class Thermostat {
    private List<Thermometer> thermoMeters = new ArrayList<>();

    private List<String> roomsToHeat = new ArrayList<>();

    private int minimumTemperature;

    public Thermostat() {
        this.minimumTemperature = 23;
    }

    public void addThermometer(Thermometer thermometer){
        thermoMeters.add(thermometer);
        thermometer.setThermometerObserver(new ThermometerObserver() {
            @Override
            public void handleTemperatureChange(int temp, String room) {
                if (temp < minimumTemperature) {
                    roomsToHeat.add(room);
                } else {
                    roomsToHeat.remove(room);
                }
            }
        });
    }

    /*
    public List<String> getRoomsToHeat() {
        List<String> result = new ArrayList<>();
        for (Thermometer element :thermoMeters){
            if (element.getTemperature()<minimumTemperature){
                result.add(element.getRoom());
            }
        }
        return result;
    }
    */

    public List<String> getRoomsToHeat() {
        return roomsToHeat;
    }

    public static void main(String[] args) {
        System.out.println("Teszt");
        ThermometerObserver to = new ThermometerObserver() {
            @Override
            public void handleTemperatureChange(int temp, String room) {

            }
        };
        System.out.println("Teszt vége");

    }
}
