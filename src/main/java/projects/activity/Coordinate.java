package projects.activity;

public class Coordinate {
    private double latitude;
    private double longitude;

    public Coordinate(double latitude, double longitude) {
        if ((latitude<-90) || (latitude>90)){
            throw new IllegalArgumentException("Wrong latitude coordinate! "+latitude);
        }
        if ((longitude<-180) || (longitude>180)){
            throw new IllegalArgumentException("Wrong longitude coordinate! "+longitude);
        }

        this.latitude = latitude;
        this.longitude = longitude;
    }

    public double getLatitude() {
        return latitude;
    }

    public double getLongitude() {
        return longitude;
    }

}
