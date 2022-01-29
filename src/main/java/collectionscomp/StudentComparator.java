package collectionscomp;

import java.util.Comparator;

public class StudentComparator implements Comparator<Student> {
    /*
    @Override
    public int compare(Student s1, Student s2) {
        return s1.getHeight()-s2.getHeight();
    }

     */
    /*
    @Override
    public int compare(Object o1, Object o2) {
        return ((Student) o1).getHeight()-((Student) o2).getHeight();
    }
    */

    @Override
    public int compare(Student o1, Student o2) {
        return Integer.valueOf(o1.getHeight()).compareTo(o2.getHeight());
    }
}
