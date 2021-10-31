package arraylist;

import java.util.ArrayList;
import java.util.List;

public class Crossword {
    public static void main(String[] args) {
        List<String> words = new ArrayList<>();
        words.add("KULCS");
        words.add("KÁLYHA");
        words.add("LÓ");
        words.add("AJTÓ");
        words.add("CSERESZNYEFA");
        words.add("TEJ");
        words.add("FELHŐ");
        words.add("CIPŐ");
        words.add("MOSODA");
        words.add("KÁVÉTEJSZÍN");
        words.add("CITERA");
        words.add("BABA");
        System.out.println("A lista elemei: "+words.toString());
        System.out.println("A hatbetűs szavak:");
        for (int i=0; i<words.size(); i++){
            if (words.get(i).length()==6) {
                System.out.println(words.get(i));
            }
        }

        System.out.println();
        for (String element: words){
            if (element.length()==6){
                System.out.println(element);
            }
        }

    }
}
