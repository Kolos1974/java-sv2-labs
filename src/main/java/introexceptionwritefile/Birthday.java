package introexceptionwritefile;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Birthday {
    public static void main(String[] args) throws IOException {
        List<String> birthdays = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Kérem adja meg, hány embert akar felvenni a listába!");
        String line= scanner.nextLine();
        int peopleNumber= Integer.parseInt(line);
        for (int i = 0; i<peopleNumber; i++){
            System.out.println("Kérem adja meg a nevet:");
            String name = scanner.nextLine();
            System.out.println("Kérem adja meg a születési dátumát:");
            String date = scanner.nextLine();
            line = "Neve: "+name+", születési ideje: "+date;
            birthdays.add(line);
        }

        try {
            Files.write(Paths.get("src/main/resources/birthdays.txt"), birthdays);
        } catch (IOException e) {
            throw new IOException("Can't wrie the file", e);
        };

    }


}
