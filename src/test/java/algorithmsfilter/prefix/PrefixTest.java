package algorithmsfilter.prefix;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class PrefixTest {

    @Test
    void getWordsStartWith() {
        Prefix prefix = new Prefix();
        List<String> list = Arrays.asList("Hétfő", "Kedd", "Szerda", "Csütörtök", "Péntek", "Szombat","Vasárnap");

        assertEquals("Hétfő", prefix.getWordsStartWith(list,"Hé").get(0));
        assertEquals(2, prefix.getWordsStartWith(list,"Sz").size());

        assertEquals(0, prefix.getWordsStartWith(list,"Monday").size());
    }
}