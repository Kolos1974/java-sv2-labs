package finalmodifier;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Week {

    public static final List<String> DAYS = Arrays.asList("Hétfő", "Kedd", "Szerda", "Csütörtök", "Péntek", "Szombat", "Vasárnap");

    public static void main(String[] args) {
        List<String> week = Arrays.asList("Hétfő", "Kedd", "Szerda", "Csütörtök", "Péntek", "Szombat", "Vasárnap");
        System.out.println("A hét napjai: "+week.toString());
        week.set(1,"Szerda");
        System.out.println("A hét napjai: "+week.toString());

        DAYS.set(1, "Szerda");
        System.out.println(DAYS);
    }

}
