package introexceptionreadfiletestjunit5;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class Words {
    public String getFirstWordWithA(Path path)  {
        List<String> text = null;
        try {
            text = Files.readAllLines(path);
        } catch (IOException ioe) {
            // throw new IllegalStateException("Can not read file.", ioe);
            return "A";
        }

        for (String element : text){
            if (element.startsWith("A")){
                return element;
            }
        }

        return "A";
    }
}
