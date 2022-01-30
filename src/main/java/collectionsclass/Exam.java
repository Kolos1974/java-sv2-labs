package collectionsclass;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Exam {
    private List<ExamResult> results;

    public Exam(List<ExamResult> results) {
        this.results = results;
    }

    public List<ExamResult> getResults() {
        return results;
    }

    public List<String> getNamesOfSucceededPeople(int places) {
        List<ExamResult> peoples = new ArrayList<>(results);
        Collections.sort(peoples, new Comparator<ExamResult>() {
            @Override
            public int compare(ExamResult o1, ExamResult o2) {
                return ((Integer) o1.getResult()).compareTo((Integer) o2.getResult());
            }
        });

        Collections.reverse(peoples);
        List<String> send = new ArrayList<>();
        int freePlace = places;
        for (ExamResult element: peoples){
            if (freePlace>0){
                send.add(element.getName());
                freePlace--;
            }
        }

        return send;
    }
}
