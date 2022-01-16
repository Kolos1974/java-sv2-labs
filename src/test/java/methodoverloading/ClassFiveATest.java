package methodoverloading;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ClassFiveATest {


    ClassFiveA classFiveA = new ClassFiveA();

    @Test
    void testClassFiveA(){
        assertEquals(5, classFiveA.getStudents().size());

    }

    @Test
    void testThirdStudent(){
        assertEquals("Rajkona Ádám", classFiveA.getTodayReferringStudent(2));
    }

    @Test
    void testThirdStudentByNumber(){
        assertEquals("Rajkona Ádám", classFiveA.getTodayReferringStudent(Number.THREE));
    }

    @Test
    void testThirdStudentByNumberName(){
        assertEquals("Rajkona Ádám", classFiveA.getTodayReferringStudent(Number.valueOf("THREE")));
    }

}