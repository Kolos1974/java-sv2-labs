package introexceptionwritefiletestjunit5;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.io.TempDir;

import java.io.File;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class BooksTest {

    @TempDir
    File tempFolder;

    @Test
    void testBetterList(){
        Books books = new Books();
        books.readFile();
        List<String> betterBooks = books.makeBetterList(books.text);
        assertEquals("Molnár Ferenc: Pál utcai fiúk", betterBooks.get(1));

    }

}