package aslist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Sequence {
    public static void main(String[] args) {
        List<Integer> elements = new ArrayList<>(Arrays.asList(1, 2));
        System.out.println("A lista mérete: "+elements.size()+"db, a lista elemei: "+elements.toString());
        for(int i = 1; i<6; i++){
            elements.add(elements.get(elements.size()-2)*elements.get(elements.size()-1));
        }
        System.out.println("A lista mérete: "+elements.size()+"db, a lista elemei: "+elements.toString() );
    }

}
