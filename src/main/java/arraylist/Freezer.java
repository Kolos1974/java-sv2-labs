package arraylist;

import java.util.ArrayList;
import java.util.List;

public class Freezer {

    public static void main(String[] args) {
        List<String> food = new ArrayList<>();
        food.add("Csirkemell");
        food.add("Borsó");
        food.add("Hurka");
        food.add("Halászlé");
        food.add("Steak burgonya");
        System.out.println("A mélyhűtő tartalma: "+food.toString());
        food.remove(1);
        food.remove("Hurka");
        System.out.println("A mélyhűtő aktuális tartalma: "+food.toString());
    }
}
