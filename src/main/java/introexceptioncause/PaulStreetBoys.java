package introexceptioncause;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class PaulStreetBoys {
    public static void main(String[] args) {
        PaulStreetBoys paulStreetBoys = new PaulStreetBoys();
        List<String> boysName = paulStreetBoys.readText(Paths.get("src/main/resources/palutcaifiuk.txt"));
        paulStreetBoys.writeFirstLetter(boysName);

    }

    public List<String> readText(Path path) {
        List<String> text = null;
        try {
            text = Files.readAllLines(path);
        } catch (IOException ioe) {
            throw new IllegalStateException("Fine not found!", ioe);
        }
        return text;
    }

    public void writeFirstLetter(List<String> text) {
        for (String element : text) {
            if (element.startsWith("Nemecsek")) {
                System.out.println(element.toLowerCase());
            } else {
                System.out.println(element);
            }

        }
    }

}
