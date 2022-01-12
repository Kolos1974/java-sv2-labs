package introexceptiontrycatchtrace;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class Winner {

    List<String> people = Arrays.asList("Kiss Béla", "Nagy Olga", null, "Örök Cézár");

    public String getWinner(){
        Random random = new Random();
        int pos = random.nextInt(people.size());
        return people.get(pos).toUpperCase();
    }
}
