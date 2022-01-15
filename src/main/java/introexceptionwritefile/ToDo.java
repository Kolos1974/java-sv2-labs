package introexceptionwritefile;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ToDo {

    public static void main(String[] args) throws IOException {
        List<String> todos = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        String line;
        do {
            System.out.println("Adja meg a következő Todo elemet!");
            line = scanner.nextLine();
            todos.add(line);
        } while (!line.equals("x"));

        try {
            Files.write(Paths.get("todos.txt"), todos);
        } catch (IOException e) {
            throw new IOException("Can't write a file!");
        }
    }
}
