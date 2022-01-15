package introexceptionfinally;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class Names {
    List<String> namesText = null;

    public static void main(String[] args) {
        Names names = new Names();
        Path path = Paths.get("src/main/resources/names.txt");
        names.namesText = names.readFile(path);
        names.findDr(names.namesText);

        Path path2 = Paths.get("src/main/resources/anothernames.txt");
        names.namesText = names.readFile(path2);
        names.findDr(names.namesText);

        Path path3 = Paths.get("src/main/resources/notnames.txt");
        names.namesText = names.readFile(path3);
        names.findDr(names.namesText);



    }

    public List<String> readFile(Path path){
        List<String> names = null;
        try {
             names = Files.readAllLines(path);
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            System.out.println("End of reading.!");
        }
        return names;
    }

    public void findDr (List<String> names){
        for (String element : names){
            if (element.startsWith("dr")){
                System.out.println(element);
                return;
            }
        }
        System.out.println("");
    }



}
