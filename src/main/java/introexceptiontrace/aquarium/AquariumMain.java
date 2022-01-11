package introexceptiontrace.aquarium;

public class AquariumMain {

    public static void main(String[] args) {
        Aquarium aquarium = new Aquarium();

        Fish fish1 = new Fish("Neonhal", "világoskék");
        Fish fish2 = new Fish("Aranyhal", "sárga");
        Fish fish3 = new Fish("Zebradánió", "kék, fehér");

        // Itt keletkezik a kivétel, mert a halak listája nincs inicializálva.
        aquarium.addFish(fish1);
        aquarium.addFish(fish2);
        aquarium.addFish(fish3);
        System.out.println("A halak száma: "+aquarium.getNumberOfFish());

    }
}
