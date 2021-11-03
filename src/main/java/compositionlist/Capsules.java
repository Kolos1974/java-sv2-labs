package compositionlist;

import java.util.ArrayList;
import java.util.List;

public class Capsules {
    private List<String> capsulesColors = new ArrayList<>();

    public void addLast(String color){
        capsulesColors.add(color);
    }

    public void addFirst(String color){
        /*
        capsulesColors.add("");
        for (int i= capsulesColors.size()-1; i>0;  i--){
            capsulesColors.set(i, capsulesColors.get(i-1));
        }
        capsulesColors.set(0, color);

         */
        capsulesColors.add(0, color);
    }

    public void removeFirst(){
        if (capsulesColors.size()>0) {
            capsulesColors.remove(0);
        }
    }

    public void removeLast(){
        if (capsulesColors.size()>0) {
            capsulesColors.remove(capsulesColors.size() - 1);
        }
    }

    public List<String> getColors(){
        return capsulesColors;
    }

    public static void main(String[] args) {
        Capsules capsules = new Capsules();
        capsules.addLast("Piros");
        capsules.addLast("Kék");
        capsules.addLast("Fekete");
        capsules.addLast("Fehér");

        System.out.println(capsules.getColors());
        capsules.removeFirst();
        System.out.println(capsules.getColors());
        capsules.addLast("Rózsaszín");
        System.out.println(capsules.getColors());
        capsules.addFirst("Lila");
        System.out.println(capsules.getColors());
        capsules.removeLast();
        System.out.println(capsules.getColors());
    }

}
