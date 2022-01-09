package exceptions.measurement;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class Measurement {

    public List<String> readFromFile(Path path) {
        List<String> result = null;
        try {
            result = Files.readAllLines(path);
        } catch (IOException ioe) {
            throw new IllegalStateException("File not found", ioe);
        }

        return result;
    }

    public List<String> validate(List<String> list) {
        List<String> errors = new ArrayList<>();
        for (String element : list) {
            if (!(validate(element))) {
                errors.add(element);
            }
        }
        return errors;
    }

    public boolean validate(String element) {
        boolean result = true;
        String[] parts = element.split(",");

        if (!(parts.length == 3)) {
            result = false;
            return result;
        }

        try {
            int number = Integer.parseInt(parts[0]);
        } catch (NumberFormatException nfe) {
            result = false;
            return result;
        }

        try {
            double numberd = Double.parseDouble(parts[1]);
        } catch (NumberFormatException nfe) {
            result = false;
            return result;
        }

        if ((parts[2].split(" ").length < 2)) {
            result = false;
            return result;
        }

        return result;
    }


    public static void main(String[] args) {
        Measurement measurement = new Measurement();

        Path path = Paths.get("src/main/resources/measurementdata.csv");
        //System.out.println(measurement.readFromFile(Paths.get("src/main/resources/measurementdata.csv")));
        System.out.println(measurement.readFromFile(path));

        System.out.println(measurement.validate(measurement.readFromFile(path)));

        System.out.println("");
        List<String> errors = measurement.validate(measurement.readFromFile(path));
        for (String element: errors){
            System.out.println(element);
        }


    }

}
