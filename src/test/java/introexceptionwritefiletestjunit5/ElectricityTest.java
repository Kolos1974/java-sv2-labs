package introexceptionwritefiletestjunit5;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.io.TempDir;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ElectricityTest {

    @TempDir
    File tempFolder;

    @Test
    void testWrite(){
        Path path = tempFolder.toPath().resolve("works.txt");
        System.out.println(path);

        List<String> works = Arrays.asList(LocalDate.now().toString()+", "+"Ferenciek tere",
                LocalDate.now().toString()+", "+"Deák tér");
        try {
            Files.write(path, works);
        } catch (IOException e) {
            e.printStackTrace();
        }
        List<String> lines = null;
        try {
            lines = Files.readAllLines(path);
        } catch (IOException e) {
            e.printStackTrace();
        }
        assertEquals(2, lines.size());
    }

    @Test
    void anotherTest(){
        Electricity electricity = new Electricity();
        electricity.fillWorksList();

        Path path = tempFolder.toPath().resolve("works.txt");
        System.out.println(path);

        try {
            electricity.writeStreets(path);
        } catch (IOException e) {
            e.printStackTrace();
        }

        List<String> lines = null;
        try {
            lines = Files.readAllLines(path);
        } catch (IOException e) {
            e.printStackTrace();
        }
        assertEquals(3, lines.size());
    }
}