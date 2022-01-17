package interfaces.animal;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Zoo {
    private List<Animal> animals;

    public Zoo(List<Animal> animals) {
        this.animals = animals;
    }

    public int getNumberOfAllLegs(){
        int sum = 0;
        for (Animal element : animals){
            sum += element.getNumberOfLegs();
        }
        return sum;
    }

    public int getNumberOfAnimals(){
        return animals.size();
    }

    public static void main(String[] args) {
        Duck duck = new Duck();
        Lion lion = new Lion();
        Worm worm = new Worm();

        List<Animal> list = new ArrayList<>(Arrays.asList(duck, lion, worm));
        Zoo zoo = new Zoo(list);
        System.out.println(zoo.getNumberOfAnimals());
        System.out.println(zoo.getNumberOfAllLegs());
    }


}
