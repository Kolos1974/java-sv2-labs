package introexceptioncause;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class Poem {

    public static void main(String[] args) {
        Poem poem = new Poem();
        List<String> poemText = poem.readText(Paths.get("src/main/resources/poem.txt"));
        poem.writeFirstLetter(poemText);
    }

    public List<String> readText(Path path)  {
        List<String> text = null;
        try {
            text = Files.readAllLines(path);
        } catch (IOException ioe) {
           throw new IllegalStateException("Fine not found!", ioe);
        }
        return text;
    }

    public void writeFirstLetter(List<String> text){
        for (String element : text){
            System.out.print(element.substring(0,1));
        }
    }


}
