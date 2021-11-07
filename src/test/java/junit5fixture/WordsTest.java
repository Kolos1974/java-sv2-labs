package junit5fixture;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class WordsTest {
    Words words;

    @BeforeEach
    void init(){
        words = new Words();
        words.addWord("egy");
        words.addWord("kettő");
        words.addWord("egykettő");
        words.addWord("három");
        words.addWord("négy");
        words.addWord("egyremegy");
    }

    @Test
    void testGetWordsStartWith(){
        //List<String> wordsAnother = Arrays.asList("egy", "egykettő", "egyremegy");
        List<String> wordsAnother = new ArrayList<String>(Arrays.asList("egy", "egykettő", "egyremegy"));

        words.getWordsStartWith("egy");

        assertEquals(wordsAnother, words.getWords());
    }

    @Test
    void testGetWordsWithLength(){
        List<String> wordsAnother = new ArrayList<String>(Arrays.asList("kettő", "három"));

        words.getWordsWithLength(5);

        assertEquals(wordsAnother, words.getWords());
    }
}
