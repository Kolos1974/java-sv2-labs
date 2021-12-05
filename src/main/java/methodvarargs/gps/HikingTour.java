package methodvarargs.gps;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class HikingTour {
    private List<FieldPoint> fieldPoints = new ArrayList<>();

    public void logFieldPoints(LocalDateTime timeOfLogging, FieldPoint... fieldPointsToLog){
        if (timeOfLogging == null) {
            throw new IllegalArgumentException("TimeOfLogging is not good!");
        }
        for (FieldPoint element:fieldPointsToLog){
            element.setTimeOfLogging(timeOfLogging);
            fieldPoints.add(element);
        }
    }

    public List<FieldPoint> getFieldPoints() {
        return fieldPoints;
    }
}
