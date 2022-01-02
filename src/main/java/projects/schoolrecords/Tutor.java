package projects.schoolrecords;

import java.util.ArrayList;
import java.util.List;

public class Tutor {
    private String name;
    private List<Subject> subjects;

    public Tutor(String name, List<Subject> subjects) {
        if (!(isEmpty(name))){
            this.name = name;
            this.subjects = subjects;
        } else {
            throw new IllegalArgumentException();
        }
    }

    public String getName() {
        return name;
    }

    public boolean tutorTeachingSubject(Subject subject){
        for (Subject element: subjects){
            if (element.getSubjectName().equals(subject.getSubjectName())){
                return true;
            }
        }
        return false;
    }

    private boolean isEmpty(String str) {
        if ((str == null) || (str.isEmpty())) {
            return true;
        }
        return false;
    }

}
