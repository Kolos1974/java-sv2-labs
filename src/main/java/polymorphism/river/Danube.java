package polymorphism.river;

import java.util.Arrays;
import java.util.List;

public class Danube extends River{
    private List<String> capitals;

    public Danube(String name, int length, List<String> capitals) {
        super(name, length);
        this.capitals = capitals;
    }

    public List<String> getCapitals() {
        return capitals;
    }

    public static void main(String[] args) {
        Water water = new Danube("Tisza", 962, Arrays.asList("Ukrajna", "Szlovákia", "Magyarország", "Románia", "Szerbia" ));
        River river = new Danube("Bodrog", 67, Arrays.asList("Szlovákia", "Magyarország"));
        Danube danube = new Danube("Duna", 2850, Arrays.asList("Németország","Ausztria","Szlovákia","Magyarország","Szerbia","Románia"));

        System.out.println(water.toString());
        System.out.println(river.getName()+" "+river.getLength());
        System.out.println(danube.getName()+" "+danube.getLength()+" "+danube.getCapitals());


    }
}
