package algorithmsfilter.zoo;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ZooTest {

    @Test
    void getAnimalsWithNumberOfLegsGiven() {
        List<Animal> animals = new ArrayList<>();
        animals.add(new Animal("Elefánt", 4));
        animals.add(new Animal("Zsiráf", 4));
        animals.add(new Animal("Csiga", 0));
        animals.add(new Animal("Delfin", 0));
        animals.add(new Animal("Ló", 4));
        animals.add(new Animal("Kacsa", 2));

        Zoo zoo = new Zoo(animals);

        assertEquals("Csiga", zoo.getAnimalsWithNumberOfLegsGiven(0).get(0).getName());
        assertEquals(3, zoo.getAnimalsWithNumberOfLegsGiven(4).size());


    }
}