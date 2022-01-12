package introexceptionthrowjunit5;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StudentTest {

    @Test
    public void testNormal(){
        Student student = new Student();
        student.addNote(2);
        student.addNote(5);
        assertEquals(2,student.getNotes().size());
        assertEquals(5, student.getNotes().get(1).intValue());

    }

    @Test
    public void testAddNoteInvalidNote() {
        Student student = new Student();
        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class,
                () -> student.addNote(0));
        assertEquals("Note must be between 1 and 5!", exception.getMessage());
    }

}