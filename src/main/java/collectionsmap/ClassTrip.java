package collectionsmap;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ClassTrip {
    private Map<String, Integer> payments = new HashMap<>();

    public Map<String, Integer> getInpayments() {
        return payments;
    }

    public void loadInpayments(Path path){
        List<String> text = new ArrayList<>();
        try {
            text = Files.readAllLines(path);
        } catch (IOException e) {
            throw new IllegalStateException("Can not read file.", e);
        }
        for (String element : text){
            String[] line = element.split(":");
            payments.put(line[0], Integer.parseInt(line[1].trim()));
        }
    }

    public static void main(String[] args) {
        ClassTrip classTrip = new ClassTrip();
        classTrip.loadInpayments(Paths.get("src/test/resources/inpayments.txt"));
        System.out.println(classTrip.getInpayments());
    }

}
