package projects.schoolrecords;

import java.util.ArrayList;
import java.util.List;

public class Student {
    private String studentName;
    private List<Mark> marks = new ArrayList<>();

    public Student(String studentName) {
        if (!(isEmpty(studentName))) {
            this.studentName = studentName;
        } else {
            throw new IllegalArgumentException("Student name must not be empty!");
        }

    }

    public String getStudentName() {
        return studentName;
    }

    public String getName(){
        return studentName;
    }

    @Override
    public String toString() {
        return studentName + ' ' +
                "marks: " + getMarks();

    }

    public String getMarks(){
        String result = "";
        for (Mark mark : marks){
            result = result + mark.getSubject().getSubjectName()+": "+mark.getMarkType().getDescription()+
                    '('+mark.getMarkType().getValue()+')';
        }
        return result;
    }

    public void grading(Mark mark) {
        if (!(mark == null)) {
            marks.add(mark);
        } else {
            throw new NullPointerException("Mark must not be null!");
        }


    }

    public double calculateAverage() {
        int sum = 0;
        for (Mark element : marks) {
            sum += element.getMarkType().getValue();
        }
        if (marks.size() > 0) {
            return (double) ((int) (sum * 100.0) / (marks.size())) / 100;
        } else {
            return 0.0;
        }
    }

    public double calculateSubjectAverage(Subject subject) {
        int sum = 0;
        int num = 0;
        for (Mark element : marks) {
            if (element.getSubject().getSubjectName().equals(subject.getSubjectName())) {
                sum += element.getMarkType().getValue();
                num++;
            }
        }
        if (num > 0) {
            return sum / (num * 1.0);
        } else {
            return 0.0;
            //throw new ArithmeticException();
        }

    }

    private boolean isEmpty(String str) {
        if ((str == null) || (str.isEmpty())) {
            return true;
        }
        return false;
    }

}
