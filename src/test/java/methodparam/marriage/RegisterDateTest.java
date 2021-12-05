package methodparam.marriage;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

class RegisterDateTest {

    @Test
    void testCreate() {
        RegisterDate registerDate = new RegisterDate("születés ideje", LocalDate.of(1974, 8, 20));

        assertEquals("születés ideje", registerDate.getDescription());
        assertEquals(LocalDate.of(1974, 8, 20), registerDate.getDate());
    }

}