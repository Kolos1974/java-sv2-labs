package primitivetypes.exam;

import java.util.ArrayList;
import java.util.List;

public class Exam {
    private List<Person> examiners = new ArrayList<>();

    public List<Person> getExaminers() {
        return examiners;
    }

    public void addPerson(Person person){
        examiners.add(person);
    }

    @Override
    public String toString() {
        return "Examiners{" +
                "exams=" + examiners +
                '}';
    }
}
