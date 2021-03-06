package interfaces.animal;

import interfaces.animal.Lion;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LionTest {


    @Test
    void testGetNumberofLegs() {
        Lion lion = new Lion();

        assertEquals(4, lion.getNumberOfLegs());
    }

    @Test
    void testGetName() {
        Lion lion = new Lion();

        assertEquals("Lion", lion.getName());
    }

}