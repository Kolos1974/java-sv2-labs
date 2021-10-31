package looptypesmodify;

import java.util.ArrayList;
import java.util.List;

public class LanguageSchool {
    public static void main(String[] args) {
        List<Student> list  = new ArrayList<>();
        Student student1 = new Student("Jónás Anna");
        Student student2 = new Student("Péter Géza");
        Student student3 = new Student("Tóth Árpád");
        Student student4 = new Student("József Attila");
        list.add(student1);
        list.add(student2);
        list.add(student3);
        list.add(student4);
        System.out.println("A lista mérete: "+list.size());

        Student tempStudent = list.get(1);
        tempStudent.setActive(false);
        list.set(1, tempStudent);
        tempStudent = list.get(2);
        tempStudent.setActive(false);
        list.set(2, tempStudent);

        // Közvetlenül az objektumon végezhetek módosítást!
        // Hiába tettem bele egy listába, nem kell azt kivennem, és visszatennem!
        student4.setActive(false);


        List<Student> studentsToRemove = new ArrayList<>();
        for (Student st: list){
            if (!st.isActive()){
                studentsToRemove.add(st);
            }
        }
        list.removeAll(studentsToRemove);
        System.out.println("A lista mérete: "+list.size());

    }
}
