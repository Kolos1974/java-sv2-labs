package collectionslist;

import java.util.LinkedList;

public class BunchOfFlowers {
    private LinkedList<String> bunch = new LinkedList<>();

    public LinkedList<String> getBunch() {
        return bunch;
    }

    public void addFlower(String flower){
        bunch.add(flower);
    }

    public void addFlowerInTheMiddle(String flower){
        if (bunch.size()%2==0){
            bunch.add(bunch.size()/2, flower);
        } else {
            int pos = bunch.size()/2;
            bunch.add(pos, flower);
            bunch.add(pos+2, flower);
        }
    }

    public static void main(String[] args) {
        System.out.println((int) 5/2);
    }



}
