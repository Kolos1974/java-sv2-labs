package staticattrmeth.vet;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DogTest {

    @Test
    void testDog() {
        Dog dog = new Dog("Mici", 4, Species.MIXTURE);

        assertEquals("Mici", dog.getName());
        assertEquals(4, dog.getAge());
        assertEquals(Species.MIXTURE, dog.getKind());
        assertEquals(0, dog.getIdNumber());
    }

}