package introexceptionthrowjunit4;

import java.util.ArrayList;
import java.util.List;

public class Student {
    List<Integer> notes = new ArrayList<>();

    public List<Integer> getNotes() {
        return notes;
    }

    public void addNote(int note){
        if ((note<1) || (note>5)) {
            throw new IllegalArgumentException("Hibás osztályzat!");
        }
        notes.add(note);
    }

}
