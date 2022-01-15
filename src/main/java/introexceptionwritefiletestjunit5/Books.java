package introexceptionwritefiletestjunit5;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class Books {
    List<String> text = new ArrayList<>();

    public void readFile(){
        Path path = Paths.get("src/test/resources/books.txt");
        try {
            text = Files.readAllLines(path);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public List<String> makeBetterList(List<String> source){
        List<String> result = new ArrayList<>();
        for (String element : source){
            String[] parts = element.split(";");
            String line = parts[2]+": "+parts[1];
            result.add(line);
        }
        return result;
    }

    public void writeList(Path path, List<String> text){
        try {
            Files.write(path, text);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    public static void main(String[] args) {
        Books books = new Books();
        books.readFile();
        System.out.println(books.text);
        System.out.println(books.makeBetterList(books.text));

        Path path = Paths.get("src/test/resources/booksbetter.txt");
        books.writeList(path, books.makeBetterList(books.text));
    }

}
