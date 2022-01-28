package nestedclasses.thermo;

public class Thermometer implements ThermometerObserver{
    private String room;
    private int temperature;
    private ThermometerObserver thermometerObserver;

    public Thermometer(String roomName, int temperature) {
        this.room = roomName;
        this.temperature = temperature;
    }

    public String getRoom() {
        return room;
    }

    public int getTemperature() {
        return temperature;
    }

    public ThermometerObserver getThermometerObserver() {
        return thermometerObserver;
    }

    @Override
    public void handleTemperatureChange(int temp, String room) {
        this.temperature = temp;
        this.room = room;
    }

    public void onTemperatureChanged(){
        if (!(thermometerObserver==null)){
            thermometerObserver.handleTemperatureChange(temperature,room);
        }
    }

    public void setTemperature(int temperature) {
        this.temperature = temperature;
        onTemperatureChanged();
    }

    public void setThermometerObserver(ThermometerObserver observer){
        this.thermometerObserver = observer;
        onTemperatureChanged();
    }



}
