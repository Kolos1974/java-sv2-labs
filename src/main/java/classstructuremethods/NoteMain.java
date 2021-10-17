package classstructuremethods;

public class NoteMain {
    public static void main(String[] args) {
        Note note = new Note();

        note.setName("John");
        note.setTopic("Vote");
        note.setText("MZP won!");

        System.out.println(note.getNoteText());
    }

}
