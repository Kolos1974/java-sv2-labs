package collectionsset;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class PhysicalEducation {


    public Set<Integer> getOrderInLessons(List<Student> l){
        Set<Integer> result = new TreeSet<>();
        for(Student s: l){
            result.add(s.getHeight());
        }
        return result;
    }

    public static void main(String[] args) {
        Student student1 = new Student("Kiss Géza", 179);
        Student student2 = new Student("Kiss Ágnes", 156);
        Student student3 = new Student("Nagy Vilmos", 172);
        Student student4 = new Student("Horváth Béla", 180);
        Student student5 = new Student("Nagy Elek", 179);
        Student student6 = new Student("Szabó Géza", 182);
        Student student7 = new Student("Szabó László", 171);
        Student student8 = new Student("Ötvös Csöpi", 186);

        List<Student> students = new ArrayList<>();
        students.add(student1);
        students.add(student2);
        students.add(student3);
        students.add(student4);
        students.add(student5);
        students.add(student6);
        students.add(student7);
        students.add(student8);

        for (Student s :students){
            System.out.println(s.getName()+" "+s.getHeight());
        }


        PhysicalEducation physicalEducation = new PhysicalEducation();
        System.out.println(physicalEducation.getOrderInLessons(students));


    }

}
