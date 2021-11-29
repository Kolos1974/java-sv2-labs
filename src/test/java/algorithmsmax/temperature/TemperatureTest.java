package algorithmsmax.temperature;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class TemperatureTest {

    @Test
    void getMin() {
        Temperature temperature = new Temperature();
        List<Integer> list = Arrays.asList(12,15,4,6,8,-2,5,22);

        assertEquals(-2, temperature.getMin(list));
    }
}