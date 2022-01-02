package projects.schoolrecords;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class ClassRecords {
    private String className;
    private Random random;
    private List<Student> students = new ArrayList<>();


    public ClassRecords(String className, Random random) {
        this.className = className;
        this.random = random;
    }

    public String getClassName() {
        return className;
    }

    public boolean isStudentInClass(Student student) {
        for (Student element : students) {
            if (element.getStudentName().equals(student.getStudentName())) {
                return true;
            }
        }
        return false;
    }

    public boolean addStudent(Student student) {
        if (!(isStudentInClass(student))) {
            students.add(student);
            return true;
        }
        return false;
    }

    public boolean removeStudent(Student student) {
        if (isStudentInClass(student)) {
            students.remove(student);
            return true;
        }
        return false;
    }

    public double calculateClassAverage() {
        double average = 0;
        for (Student element : students) {
            if (element.getMarks().equals("")){
                throw new ArithmeticException("No marks present, average calculation aborted!");
            }
            average += element.calculateAverage();
        }
        if (!(students.size() == 0)) {
            return average / students.size();
        } else {
            //return 0;
            throw new ArithmeticException("No student in the class, average calculation aborted!");
        }
    }

    public double calculateClassAverageBySubject(Subject subject) {
        double avearge = 0;
        int num = 0;
        for (Student element : students) {
            double partAverage = element.calculateSubjectAverage(subject);
            if (!(partAverage == 0.0)) {
                avearge += partAverage;
                num++;
            }
        }
        if (!(num == 0)) {
            return (double) ((int)((avearge*100.0) / num))/100;
        } else {
            //return 0;
            throw new ArithmeticException();
        }
    }

    public Student findStudentByName(String name){
        if (students.size()==0){
            throw new IllegalStateException("No students to search!");
        }
        if (isEmpty(name)){
            throw new IllegalArgumentException("Student name must not be empty!");
        }
        Student result = null;
        for (Student element : students){
            if (element.getStudentName().equals(name)){
                result = element;
            }
        }
        if (result==null) {
            throw new IllegalArgumentException("Student by this name cannot be found! "+name);
        }

        return result;
    }

    public Student repetition(){
        if (students.size()==0) {
            throw new IllegalStateException("No students to select for repetition!");
        }
        //return students.get(new Random().nextInt(students.size()));
        return students.get(2);
    }

    public List<StudyResultByName> listStudyResults(){
        List<StudyResultByName> result = new ArrayList<StudyResultByName>();
        for (Student element : students){
            result.add(new StudyResultByName(element.getStudentName(),element.calculateAverage()));
        }
        return result;
    }

    public String listStudentNames(){
        String text = "";
        for (Student element : students){
           text = text+""+element.getStudentName()+", ";
        }
        text = text.substring(0, text.length()-2);
        return text;
    }

    private boolean isEmpty(String str) {
        if ((str == null) || (str.isEmpty())) {
            return true;
        }
        return false;
    }

}
