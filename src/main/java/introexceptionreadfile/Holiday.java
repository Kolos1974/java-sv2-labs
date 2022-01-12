package introexceptionreadfile;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class Holiday {

    public static void main(String[] args) {

        List<String> text = null;
        Path path = Paths.get("src/main/resources/holiday.txt");
        try{
            text = Files.readAllLines(path);
        } catch (IOException ioe){
           ioe.printStackTrace();
        }

        for (String element: text){
            System.out.println(element);
        }

    }
}
