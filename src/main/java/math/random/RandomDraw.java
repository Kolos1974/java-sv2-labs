package math.random;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class RandomDraw {
    public static void main(String[] args) {
        List<String> people = new ArrayList<>(Arrays.asList("Papp Péter", "Kiss Géza", "Horvát Elemér", "Bajusz Nikolett",
                "Kocsis István", "Nezó Roland", "Ábel Kornél","Werne Gyula", "Daliás Róbert", "Joó István"));

        Random rnd = new Random();
        System.out.println("Az első nyertes: "+people.get(rnd.nextInt(5)) );
        System.out.println("A második nyertes: "+people.get(rnd.nextInt(5)+5) );

    }
}
