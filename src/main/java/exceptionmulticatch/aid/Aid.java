package exceptionmulticatch.aid;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class Aid {
    private int amount;

    public Aid(int amount) {
        this.amount = amount;
    }

    public int getAmount() {
        return amount;
    }

    public List<String> countAmountsOfAid(Path path){
        List<String> result = new ArrayList<>();
        List<String> fileLines = null;
        try {
            fileLines = Files.readAllLines(path);

            for (String element : fileLines){
                String[] parts = element.split(" ");
                int peopleNumber = Integer.parseInt(parts[1]);
                result.add(parts[0]+" "+amount/peopleNumber);
            }
        } catch (NullPointerException | IOException | IndexOutOfBoundsException | NumberFormatException | ArithmeticException ex) {
            throw new IllegalStateException("Something went wrong while counting.", ex);
        }
        return result;
    }

    public static void main(String[] args) {
        Aid aid = new Aid(1489600);
        System.out.println(aid.countAmountsOfAid(Paths.get("src/test/resources/population1.txt")));

    }
}
