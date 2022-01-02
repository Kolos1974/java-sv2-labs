package projects.schoolrecords;

public class StudyResultByName {
    private String studentName;
    private double studyAverage;

    public StudyResultByName(String studentName, double studyAverage) {
        if (!(isEmpty(studentName))){
            this.studentName = studentName;
            this.studyAverage = studyAverage;
        } else {
            throw new IllegalArgumentException();
        }

    }

    public String getStudentName() {
        return studentName;
    }

    public double getStudyAverage() {
        return studyAverage;
    }

    private boolean isEmpty(String str) {
        if ((str == null) || (str.isEmpty())) {
            return true;
        }
        return false;
    }
}
