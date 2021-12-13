package introinheritance.fruit;

public class FruitsMain {
    public static void main(String[] args) {
        Fruit fruit = new Fruit();
        fruit.setName("Gyümölcs");
        fruit.setWeight(1000);

        Grape grape = new Grape();
        grape.setName("Irsai");
        grape.setWeight(30);
        grape.setType("Fehér");

        Apple apple = new Apple();
        apple.setName("Alma");
        apple.setWeight(160);
        apple.setPieces(60);

        GoldenDelicious goldenDelicious = new GoldenDelicious();
        goldenDelicious.setName("Golden");
        goldenDelicious.setWeight(20);
        goldenDelicious.setPieces(1);

        Starking starking = new Starking();
        starking.setName("Starking");
        starking.setWeight(42);
        starking.setPieces(2);

        System.out.println(fruit.getName()+", "+fruit.getWeight());
        System.out.println(grape.getName()+", "+grape.getWeight()+", "+grape.getType());
        System.out.println(apple.getName()+", "+apple.getWeight()+", "+apple.getPieces());
        System.out.println(goldenDelicious.getName()+", "+goldenDelicious.getWeight()+", "+
                goldenDelicious.getPieces()+", "+goldenDelicious.getColour());
        System.out.println(starking.getName()+", "+starking.getWeight()+", "+starking.getPieces()+", "+
                starking.getColour());

    }
}
