package formatlocaleprintf;

import java.util.ArrayList;
import java.util.List;

public class Thanks {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Kiss Géza");
        list.add("Nagy Béla");
        list.add("Okos Elemér");

        for (String s : list){
            System.out.printf("Kedves %s! Örülünk, hogy termékünket válaszotta!",s);
            System.out.println();
        }
    }

}
