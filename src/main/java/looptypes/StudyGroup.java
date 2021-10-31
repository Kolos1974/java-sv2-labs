package looptypes;

import java.util.ArrayList;
import java.util.List;

public class StudyGroup {
    public static void main(String[] args) {
        StudyGroup studyGroup = new StudyGroup();
        List<String> element = new ArrayList<>();
        element.add("Kiss Géza");
        element.add("Kovácsovics Elemér");
        element.add("Horváth Blanka");
        element.add("Keresztes Tihamér");
        System.out.println("Az elemek száma: "+element.size()+" db.");
        System.out.println("Az elemek: "+element.toString());
        System.out.println();

        studyGroup.printStudyGroups(element);
    }

    public void printStudyGroups(List<String> students){
        for(String name: students){
            if (name.length()<=10) {
                System.out.println(name+ ": 1-es csoport ");
            } else {
                System.out.println(name+ ": 2-es csoport");
            }
        }

        System.out.println();
        System.out.println("Az 1-es csoport tagjai:");
        for(String name: students){
            if (name.length()<=10) {
                System.out.println(name);
            }
        }
        System.out.println();
        System.out.println("A 2-es csoport tagjai:");
        for(String name: students){
            if (!(name.length()<=10)) {
                System.out.println(name);
            }
        }



    }

}
