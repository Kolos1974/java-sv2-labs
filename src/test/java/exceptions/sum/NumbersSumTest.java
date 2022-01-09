package exceptions.sum;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class NumbersSumTest {

    NumbersSum numbersSum = new NumbersSum();

    @Test
    void testNumbersSum() {
        int[] numbers = new int[5];
        numbers[0] = 1;
        numbers[1] = 2;
        numbers[2] = 3;

        assertEquals(6, numbersSum.getSum(numbers));
    }

    @Test
    void testEmptyArray() {
        int[] emptyArray = null;

        Exception e = assertThrows(IllegalArgumentException.class, ()->numbersSum.getSum(emptyArray));
        assertEquals("Üres a tömb", e.getMessage());
    }

    @Test
    void testStringNumbers() {
        String[] stringNumbers = new String[]{"1", "2"};
        assertEquals(3, numbersSum.getSum(stringNumbers));
    }

    @Test
    void testWrongStringNumbers(){
        String[] badStringNumbers = new String[]{"1", "aa2"};

        Exception e = assertThrows(IllegalArgumentException.class, ()->numbersSum.getSum(badStringNumbers));
        assertEquals("Rossz érték a tömbben!", e.getMessage());

    }


}