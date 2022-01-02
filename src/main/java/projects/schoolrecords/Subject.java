package projects.schoolrecords;

public class Subject {
    private String subjectName;

    public Subject(String subjectName) {
        if (!(isEmpty(subjectName))) {
            this.subjectName = subjectName;
        } else {
            throw new IllegalArgumentException();
        }
    }

    public String getSubjectName() {
        return subjectName;
    }

    private boolean isEmpty(String str) {
        if ((str == null) || (str.isEmpty())) {
            return true;
        }
        return false;
    }
}
