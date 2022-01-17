package interfacerules.bill;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class Bill {

    public List<String> readBillItemsFromFile(Path path){
        List<String> result = null;
        try {
             result = Files.readAllLines(path);
        } catch (IOException e) {
            throw new IllegalArgumentException("File not found!!", e);
        }
        return result;
    }

    public static void main(String[] args) {
        Bill bill = new Bill();
        List<String> text = bill.readBillItemsFromFile(Paths.get("src/test/resources/billitems.txt"));
        System.out.println(text);

        SimpleBillWriter simpleBillWriter = new SimpleBillWriter();
        System.out.println(simpleBillWriter.writeBill(text));

        ComplexBillWriter complexBillWriter = new ComplexBillWriter();
        System.out.println(complexBillWriter.writeBill(text));

    }
}
