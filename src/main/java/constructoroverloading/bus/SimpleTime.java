package constructoroverloading.bus;

import defaultconstructor.date.SimpleDate;

public class SimpleTime {
    private int hours;
    private int minutes;

    public SimpleTime(int hours, int minutes) {
        this.hours = hours;
        this.minutes = minutes;
    }

    public SimpleTime(int hours) {
        this(hours, 0);
    }

    public SimpleTime(SimpleTime time){
        this(time.hours, time.minutes);
    }

    public int getDifference(SimpleTime time){
        return ((this.hours*60+this.minutes)-((time.getHours()*60)+ time.getMinutes()));
    }

    public String toString(){
        return hours+":"+minutes;
    }

    public int getHours() {
        return hours;
    }

    public int getMinutes() {
        return minutes;
    }
}

