package methodparam.sums;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class SeparatedSum {
    private List<Result> result = new ArrayList<>();

    public String readFile(){
        List<String> lines;
        try {
            lines = Files.readAllLines(Paths.get("src/main/resources/floatingnumbers.txt"));
        } catch (IOException e) {
            // e.printStackTrace();
            throw new IllegalStateException("File can't read", e);
        }

        return lines.get(0);
    }


    public List<Result> sum(String floatingNumbers) {

        result.add(new Result(Type.POSITIVE, 0));
        result.add(new Result(Type.NEGATIVE, 0));

        String[] numbers = floatingNumbers.split(";");
        for (String num : numbers) {
            num = num.replace(',', '.');
            double value = Double.parseDouble(num);
            if (value < 0) {
                addResult(Type.NEGATIVE, value);
            } else {
                addResult(Type.POSITIVE, value);
            }
        }
        return result;
    }

    private void addResult(Type type, double amount){
        for (Result element:result){
            if (element.getType()==type){
                element.addAmount(amount);
            }
        }
    }

}
