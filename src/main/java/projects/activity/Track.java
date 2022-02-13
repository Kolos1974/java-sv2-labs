package projects.activity;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.List;

public class Track {
    private List<TrackPoint> trackPoints = new ArrayList<>();

    public void addTrackPoint(TrackPoint trackPoint){
        trackPoints.add(trackPoint);
    }


    public Coordinate findMaximumCoordinate(){


    }

    public Coordinate findMinimumCoordinate(){

    }

    public double getDistance(){

    }

    public double getFullDecrease(){

    }

    public double getFullElevation(){

    }

    public double getRectangleArea(){

    }


    public List<TrackPoint> getTrackPoints(){
        return trackPoints;
    }

    public void loadFromGpx(InputStream inputStream){

        try (BufferedReader br = new BufferedReader(new InputStreamReader(inputStream))) {
            String line;
            Coordinate coordinate = null;
            while ((line = br.readLine()) != null) {
                if (line.trim().startsWith("<trkpt")) {
                    String[] parts = line.split("\"");
                    double lat = Double.parseDouble(line.substring(12,22));
                    double lon = Double.parseDouble(line.substring(29,39));
                    coordinate = new Coordinate(lat, lon);
                }
                if (line.trim().startsWith("<ele")) {
                    double elevation = Double.parseDouble(line.substring(5, 10));
                    trackPoints.add(new TrackPoint(coordinate, elevation));
                }
            }
        } catch (IOException e) {
            throw new IllegalArgumentException("Cannot read file: " , e);
        }


    }



}
