package algorithmdecision.towns;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class TownTest {

    @Test
    void containsFewerHabitants() {
        List<Integer> peopleOfTowns = Arrays.asList(12300, 14012, 156, 478);
        Town town = new Town();

        assertTrue(town.containsFewerHabitants(peopleOfTowns, 200));
        assertFalse(town.containsFewerHabitants(peopleOfTowns, 150));
    }
}