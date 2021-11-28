package algorithmsum.school;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class School {

    public int getNumberOfStudents(List<Integer> headcounts) {
        /*
        int result = 0;
        for (int i=0; i<headcounts.size();i++){
            result+=headcounts.get(i);
        }
        return result;
        */

        int result = 0;
        for (int element : headcounts){
            result+=element;
        }
        return result;
    }

    public static void main(String[] args) {
        School school = new School();
        List<Integer> schoolList = new ArrayList<>();
        schoolList.add(32);
        schoolList.add(28);
        schoolList.add(29);
        System.out.println(school.getNumberOfStudents(schoolList));
    }

}
