package aslist;

import java.util.Arrays;
import java.util.List;

public class Island {
    public static void main(String[] args) {
        List<String> importantThings = Arrays.asList("Bicska", "Kalapács", "Gumicsónak");
        System.out.println("A lista jelenlegi elemei: "+importantThings.toString());
        importantThings.set(1,"Kenyér");
        System.out.println("A lista végeleges elemei: "+importantThings.toString());
    }
}
