package references.dogs;

import java.util.ArrayList;
import java.util.List;

public class Kennel {
    public static void main(String[] args) {
        List<Dog> dogs = new ArrayList<>();

        Dog dog1 = new Dog("Gombóc", 3, "fekete");
        Dog dog2 = new Dog("Vakarcs", 1, "zsemle");
        Dog dog3 = new Dog("Nyurga", 4, "fehér");
        dogs.add(dog1);
        dogs.add(dog2);
        dogs.add(dog3);

        System.out.println("Az első: "+dog1);
        System.out.println("A  második: "+dog2);
        System.out.println("A harmadik: "+dog3);

        Dog dog4 = new Dog("Kóbor",2, "szürke");
        dog4 = dogs.get(1);
        dog4.setColour("barna");

        System.out.println(dogs);

        System.out.println(dog2);
        System.out.println(dog4);

        System.out.println(dogs.size());
        System.out.println(dogs.get(0));
        System.out.println(dogs.get(1));
        System.out.println(dogs.get(2));
        System.out.println();

        Dog dog5 = new Dog("Szimat", 2, "rozsda");
        System.out.println("Az ötödik kutya: "+dog5);
        System.out.println();

        dog5 = dogs.get(1);
        System.out.println("Az ötödik kutya: "+dog5);

        dogs.add(dog5);
        System.out.println(dogs);
        System.out.println();

        Dog dog6 = new Dog("Gofry", 2, "világosbarna");
        dog6 = dog4;
        dog6.setColour("vörös");
        System.out.println(dogs);
        System.out.println();

        List<Dog> dogsNew = dogs;
        System.out.println(dogs);
        System.out.println(dogsNew);
        dog1.setName("Gombócka");
        System.out.println(dogs);
        System.out.println(dogsNew);
        // A dogsNew-ba is az elemek referenciája lett átmásolva!
        System.out.println();

        Dog dog7 = new Dog("Hetes", 7, "vaj");
        dog7 = dog4;
        dog7.setColour("karamell");
        System.out.println(dogsNew);
        System.out.println();

        dog2.setColour("koszos");
        System.out.println(dogsNew);
        System.out.println();

        dog2 = null;
        System.out.println(dogsNew);
        System.out.println();
        // Csak a hivatkozást nullázta le, az objektumra a lista eleme rámutat.

        Dog dog8 = dogs.get(1);
        dog8 = null;
        System.out.println(dogsNew);
        System.out.println();
        // Csak a dog8 hivatkozást nulláztam le!

        Dog dog9 = dogs.get(1);
        dog9.setColour("zöld");
        System.out.println(dogsNew);
        System.out.println();
        // Az objektum színe megváltozott!




    }

}
