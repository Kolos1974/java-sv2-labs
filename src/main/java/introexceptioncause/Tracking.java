package introexceptioncause;

import java.nio.file.Paths;
import java.util.List;

public class Tracking {

    public static void main(String[] args) {
        TrackPoints trackPoints = new TrackPoints();
        List<String> trackList = trackPoints.readText(Paths.get("src/main/resources/tracking.csv"));
        trackPoints.writeTrackDifference(trackList);

    }
}
