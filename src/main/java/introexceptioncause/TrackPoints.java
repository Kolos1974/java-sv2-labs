package introexceptioncause;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class TrackPoints {

    public List<String> readText(Path path) {
        List<String> text = null;
        try {
            text = Files.readAllLines(path);
        } catch (IOException ioe) {
            throw new IllegalStateException("Fine not found!", ioe);
        }
        return text;
    }

    public void writeTrackDifference(List<String> text) {
        List<Integer> difference = new ArrayList<>();
        int previous = 0;
        int db = 0;
        for (String element : text) {
            String[] parts = element.split(";");
            int value = Integer.parseInt(parts[2]);
            if (db!=0){
                System.out.println(value-previous);
            }
            previous = value;
            db++;
        }
    }
}

