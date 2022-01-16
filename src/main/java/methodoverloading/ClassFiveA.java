package methodoverloading;

import java.util.Arrays;
import java.util.List;

public class ClassFiveA {
    private List<String> students = Arrays.asList("Mézga Aladár", "Kopasz Géza", "Rajkona Ádám", "Kizsó Bea", "Ács Péter");

    public String getTodayReferringStudent(int number){
        if (students.size()>number){
            return students.get(number);
        }
        return "";
    }

    public String getTodayReferringStudent(Number number){
        return students.get(number.getValue()-1);
    }

    public String getTodayReferringStudent(String numberName){
        return students.get(Number.valueOf(numberName.toUpperCase()).getValue()-1);
    }

    public List<String> getStudents() {
        return students;
    }


}
