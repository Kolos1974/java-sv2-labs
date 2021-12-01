package algorithmstransformation.letters;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class TwoLettersTest {

    @Test
    void getFirstTwoLetters() {
        List<String > list = Arrays.asList("Ecc", "Pecc","Kimehetsz");
        TwoLetters twoLetters = new TwoLetters();

        assertEquals(3, twoLetters.getFirstTwoLetters(list).size());
        assertEquals("Ec", twoLetters.getFirstTwoLetters(list).get(0));
    }
}