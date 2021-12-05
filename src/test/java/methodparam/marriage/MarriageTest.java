package methodparam.marriage;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class MarriageTest {

    @Test
    void testGetMarriage() {
        Woman woman = new Woman("Szőke Andrea", new ArrayList<>(Arrays.asList(
                new RegisterDate("születés ideje", LocalDate.of(1981, 12, 17)))));
        Man man = new Man("Kozák Vilmos", new ArrayList<>(Arrays.asList(
                new RegisterDate("születés ideje", LocalDate.of(1975, 1, 12)),
                new RegisterDate("házasságkötés ideje", LocalDate.of(2001, 1, 1)))));
        Marriage marriage = new Marriage();
        marriage.getMarried(woman, man);

        assertEquals("Kozák-Szőke Andrea", woman.getName());
        assertEquals(3, man.getRegisterDates().size());
        assertEquals(LocalDate.now(), woman.getRegisterDates().get(1).getDate());
    }


}