package collectionscomp;

import java.text.Collator;
import java.util.*;

public class School {

    public static void main(String[] args) {
        Set<Student> students = new TreeSet<>(new StudentComparator());

        students.add(new Student("Ferenc", 179));
        students.add(new Student("Gábor", 156));
        students.add(new Student("Ági", 166));
        students.add(new Student("Olga", 175));
        students.add(new Student("Dávid", 162));
        // Nem kerül be a Set-be, mert a magasságának az értéke már szerepel.
        students.add(new Student("Dávid2", 162));

        System.out.println(students);

        Map<String, Integer> studentsMap = new TreeMap<>(Collator.getInstance(new Locale("hu", "HU")));
        studentsMap.put("Ferenc", 179);
        studentsMap.put("Gábor", 156);
        studentsMap.put("Ági", 166);
        studentsMap.put("Olga", 175);
        studentsMap.put("Dávid", 162);

        System.out.println(studentsMap);

        // Ezek is lefordulnak:
        Map<Student, Integer> map1 = new TreeMap<>();
        Map<Student, Student> map2 = new TreeMap<>();
    }
}
