package algorithmsmax.hill;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class HillTest {

    @Test
    void hillTeszt(){
        Hill hill = new Hill();
        List<Integer> list = Arrays.asList(1120, 890, 1203, 966);

        assertEquals(1203, hill.getMax(list));

    }

}