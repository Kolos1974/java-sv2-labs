package introexceptionwritefile;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;


public class RoadMap {
    public static void main(String[] args) {
        List<String> roadmap = new ArrayList<>();
        roadmap.add("Budapest");
        roadmap.add("Székesfehérvár");
        roadmap.add("Balatonaliga");
        roadmap.add("Siófok");
        roadmap.add("Balatonszárszó");
        try {
            Files.write(Paths.get("src/main/resources/roadmap.txt"), roadmap);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
