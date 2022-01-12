package introexceptioncheckedtrace;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class Neptun {

    public static void main(String[] args) {
        Neptun neptun = new Neptun();

        List<String> result = new ArrayList<>();
        try {
            List<String> text = getStrings();

            for (String element : text){
                String[] parts = element.split(",");
                result.add(parts[1]);
            }

        }catch (IOException ioe){
            ioe.printStackTrace();
        }


        System.out.println(result);
    }

    private static List<String> getStrings() throws IOException {
        List<String> text = Files.readAllLines(Paths.get("src/main/resources/neptun.csv"));
        return text;
    }


}
