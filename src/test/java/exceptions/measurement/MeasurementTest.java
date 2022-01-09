package exceptions.measurement;

import org.junit.jupiter.api.Test;

import java.nio.file.Path;
import java.nio.file.Paths;

import static org.junit.jupiter.api.Assertions.*;

class MeasurementTest {


    Measurement measurement = new Measurement();
    Path path = Paths.get("src/main/resources/measurementdata.csv");

    @Test
    void testFileLines(){
        assertEquals(11, measurement.readFromFile(path).size());
    }


}