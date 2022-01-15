package introexceptionwritefiletestjunit5;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import static java.nio.file.Files.*;

public class Electricity {
    List<String> works = new ArrayList<>();

    public void fillWorksList(){
        String line = LocalDate.of(2022,1,3).toString()+", "+"Bartók Béla utca";
        works.add(line);
        line = LocalDate.now().toString()+", "+"Teréz körút";
        works.add(line);
        line = LocalDate.now().toString()+", "+"Mechwart liget";
        works.add(line);
    }

    public void writeStreets(Path path) throws IOException {
        Files.write(path, works);
    }

    public static void main(String[] args) {
        Electricity electricity = new Electricity();
        electricity.fillWorksList();
        try {
            electricity.writeStreets(Paths.get("src/main/resources/works.txt"));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
