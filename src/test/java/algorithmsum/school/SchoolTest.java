package algorithmsum.school;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class SchoolTest {

    @Test
    void getNumberOfStudents() {
        School school = new School();
        List<Integer> schoolList = new ArrayList<>();
        schoolList.add(32);
        schoolList.add(28);
        schoolList.add(29);

        assertEquals(89, school.getNumberOfStudents(schoolList));
        assertEquals(3, schoolList.size());

        assertNotEquals(4, schoolList.size());
    }
}