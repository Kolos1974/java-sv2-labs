package methodparam.marriage;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class WomanTest {
    @Test
    void testCreate() {
        RegisterDate registerDate = new RegisterDate("születés ideje", LocalDate.of(1981, 12, 17));
        Woman woman = new Woman("Szőke Andrea", new ArrayList<>(Arrays.asList(registerDate)));

        assertEquals("Szőke Andrea", woman.getName());
        assertEquals(1, woman.getRegisterDates().size());
        assertEquals(LocalDate.of(1981, 12, 17), woman.getRegisterDates().get(0).getDate());
    }
}