package collectionsmap;

import java.util.HashMap;
import java.util.Map;

public class Casting {

    public String callNextApplicant(int lastNumber, Map<Integer, String> applicants){
        int next = Integer.MAX_VALUE;
        for (Map.Entry<Integer, String> element : applicants.entrySet()){
            System.out.println(element);
            if ((element.getKey()>lastNumber) && (element.getKey()<next)){
                next = element.getKey();
            }
        }
        return applicants.get(next);
    }

    public static void main(String[] args) {
        Casting casting = new Casting();
        Map<Integer, String> map = new HashMap<>();
        map.put(77, "Béla");
        map.put(105, "Géza");
        map.put(19, "Ági");
        map.put(45, "Alma");
        map.put(82, "Sára");
        System.out.println(map);
        System.out.println(casting.callNextApplicant(40, map));

    }

}
