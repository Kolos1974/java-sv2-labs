package junit5assert;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class DragonTest {

    @Test
    void testName() {
        Dragon dragon = new Dragon("Süsü", 1, 188);
        assertEquals("Süsü", dragon.getName());
        assertNotEquals("Pacsi", dragon.getName());

    }

    @Test
    void testNumberOfHeads() {
        Dragon dragon = new Dragon("Süsü", 1, 188);

        assertEquals(1, dragon.getNumberOfHeads());
        assertTrue(1 == dragon.getNumberOfHeads());
        assertFalse(2 == dragon.getNumberOfHeads());
    }

    @Test
    void testHeight(){
        Dragon dragon = new Dragon("Süsü", 1, 188);

        assertEquals(188, dragon.getHeight(), 0.0);
    }

    @Test
    void testNull(){
        Dragon dragon = new Dragon("Süsü", 1, 188);
        Dragon dragonAnother = null;

        assertNull(dragonAnother);
        assertNotNull(dragon);
    }

    @Test
    void testSameObjects(){
        Dragon dragon = new Dragon("Süsü", 1, 188);
        Dragon dragonAnother = dragon;

        assertSame(dragon, dragonAnother);
    }

    @Test
    void testNotSameObjects(){
        Dragon dragon = new Dragon("Süsü", 1, 188);
        Dragon dragonAnother = new Dragon("Süsü", 1, 188);

        //assertSame(dragon, dragonAnother);
        assertNotSame(dragon, dragonAnother);
    }


}
