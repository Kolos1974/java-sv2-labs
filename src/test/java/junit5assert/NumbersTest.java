package junit5assert;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class NumbersTest {

    @Test
    void testGetEvenNumbers(){
        Numbers numbers = new Numbers();
        int[] origin = {2, 8, 5, 6, 2, 3,9};
        int[] expected = {2, 8, 0, 6, 2, 0, 0};

        numbers.getEvenNumbers(origin);
        assertArrayEquals(origin, expected);


        int[] originNumbers = new int[]{2, 8, 5, 6, 2, 3,9};
        int[] expectedNumbers = new int[]{2, 8, 0, 6, 2, 0, 0};

        numbers.getEvenNumbers(originNumbers);
        assertArrayEquals(originNumbers, expectedNumbers);

    }
}
