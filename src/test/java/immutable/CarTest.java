package immutable;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CarTest {

    @Test
    void testCar(){
        assertEquals("Ford", new Car("Ford", "Mustang", 2012).getBrand());
        Exception ex = assertThrows(IllegalArgumentException.class, ()->new Car("", "Mondeo", 2006));
        assertEquals("Hibás márka!", ex.getMessage());
    }
}