package introexceptionthrowjunit4;
/*
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;
*/

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class StudentTest {

    @Test
    public void testNormal(){
        Student student = new Student();
        student.addNote(3);
        student.addNote(3);
        student.addNote(4);

        assertEquals(3, student.getNotes().size());
        assertEquals(4, student.getNotes().get(2).intValue());

    }

    /*
    @Test(expected = IllegalArgumentException.class)
    public void testAddNoteSimpleExpection() {
        student.addNote(6);
    }

    @Test
    public void testAddNoteExpectedException() {
        expectedException.expect(IllegalArgumentException.class);
        expectedException.expectMessage("Note must be between 1 and 5!");
        student.addNote(6);
    }

    @Test
    public void testAddNoteAssertThrows() {
        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class,
                () -> student.addNote(6));
        assertEquals("Note must be between 1 and 5!", exception.getMessage());
    }
    */

}