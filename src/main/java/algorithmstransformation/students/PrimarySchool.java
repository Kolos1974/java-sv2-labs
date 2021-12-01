package algorithmstransformation.students;

import java.util.ArrayList;
import java.util.List;

public class PrimarySchool {
    private List<Person> personList;

    public PrimarySchool(List<Person> personList) {
        this.personList = personList;
    }

    public List<Person> getPersonList() {
        return personList;
    }

    public void addPerson(Person person){
        personList.add(person);
    }

    public List<Student> getStudents(){
        List<Student> result = new ArrayList<>();
        for (Person element : personList){
            if (element.getAge()<=18){
                Student student = new Student(element.getName(), element.getAddress());
                result.add(student);
            }
        }
        return result;
    }
}
