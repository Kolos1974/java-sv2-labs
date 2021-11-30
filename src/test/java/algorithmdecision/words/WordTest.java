package algorithmdecision.words;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class WordTest {

    List<String> list;
    Word word;

    @BeforeEach
    void test(){
        list = Arrays.asList("Csodálatos", "Lenyűgöző", "Ámulatba ejtő");
        word = new Word();
    }

    @Test
    void containsLongerWord() {
        assertTrue(word.containsLongerWord(list, "Vonzó"));
        assertFalse(word.containsLongerWord(list, "Hihetetlenül letaglózó"));
    }

    @Test
    void containsLongerWordOther() {
        assertTrue(word.containsLongerWordOther(list, "Vonzó"));
        assertFalse(word.containsLongerWordOther(list, "Hihetetlenül letaglózó"));
    }

    @Test
    void containsLongerWordWithWhile() {
        assertTrue(word.containsLongerWordWithWhile(list, "Vonzó"));
        assertFalse(word.containsLongerWordWithWhile(list, "Hihetetlenül letaglózó"));
    }
}