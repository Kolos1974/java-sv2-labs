package stringbasic.university;

import java.util.ArrayList;
import java.util.List;

public class University {
    private List<Student> students = new ArrayList<>();

    public List<Student> getStudents() {
        return students;
    }

    public void addStudent(Student student){
        students.add(student);
    }

    public boolean areEquals(Student student, Student anotherStudent){
        return ((student.getNeptunId().equals(anotherStudent.getNeptunId())) && (student.getLearnId().equals(anotherStudent.getLearnId())));
    }

}
