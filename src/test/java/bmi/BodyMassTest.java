package bmi;

import methodstructure.bmi.BmiCategory;
import methodstructure.bmi.BodyMass;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BodyMassTest {

    @Test
    void testBodyMass(){
        BodyMass people1 = new BodyMass(86, 1.78);
        BodyMass people2 = new BodyMass(79, 1.82);

        System.out.println(people1.getBodyMassIndex());
        System.out.println(people2.getBodyMassIndex());

        assertEquals(BmiCategory.OVERHEIGHT, people1.getBody());
        assertFalse(people1.isThinnerThan(people2));


    }


}