package introexceptioncheckedtrace;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Operations {

    public static void main(String[] args) {
        Operations operations = new Operations();
        List<String> text = null;
        try {
            text = operations.readfile();
        } catch (IOException ioe){
            ioe.printStackTrace();
        }
        System.out.println(operations.getDailySchedule(text));

    }

    public List<String> readfile() throws IOException {
        List<String> text = Files.readAllLines(Paths.get("src/main/resources/underground.txt"));
        return text;
    }

    public String getDailySchedule(List<String> text){
        StringBuilder sb = new StringBuilder();
        sb.append(LocalDate.now().toString());
        sb.append(", ");
        for (String element : text){
            if (element.startsWith("2")){
                sb.append(element+" ");
            }
        }
        return sb.toString();
    }

}
