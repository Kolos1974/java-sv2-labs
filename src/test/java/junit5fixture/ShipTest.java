package junit5fixture;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ShipTest {
    Ship ship;

    @BeforeEach
    void init(){
        ship = new Ship("Kisfaludy",1846, 30);
    }

    @Test
    void testName(){
        assertEquals("Kisfaludy", ship.getName());
        assertNotEquals("Balaton", ship.getName());
    }

    @Test
    void testYearOfConstruction(){
        assertEquals(1846, ship.getYearOfConstuctions());
        assertTrue(1846==ship.getYearOfConstuctions());
        assertFalse(1849==ship.getYearOfConstuctions());
    }

    @Test
    void testLength(){
        assertEquals(30, ship.getLength(), 0.0);
    }

    @Test
    void testNull(){
        Ship shipAnother = null;
        assertNull(shipAnother);
        assertNotNull(ship);
    }

    @Test
    void testSame(){
        Ship shipAnother = ship;

        assertSame(shipAnother, ship);
    }

    @Test
    void testNotSame(){
        //Ship shipAnother = new Ship("Hableány", 1949, 27.25);
        Ship shipAnother = new Ship("Kisfaludy",1846, 30);
        //assertSame(shipAnother, ship);
        assertNotSame(shipAnother, ship);
    }
}
