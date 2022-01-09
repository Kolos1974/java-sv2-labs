package projects.schoolrecords;

public class Mark {
    private MarkType markType;
    private Subject subject;
    private Tutor tutor;



    public Mark(MarkType markType, Subject subject, Tutor tutor) {
        if (!(subject==null)) {
            this.markType = markType;
            this.subject = subject;
            this.tutor = tutor;
        } else {
            throw new NullPointerException("Both subject and tutor must be provided!");
        }

    }

    public Mark(String markType, Subject subject, Tutor tutor) {
        /*
        this.markType = MarkType.getMarkType(markType);
        this.subject = subject;
        this.tutor = tutor;
        */
        this(MarkType.valueOf(markType), subject, tutor);

    }

    public MarkType getMarkType() {
        return markType;
    }

    public Subject getSubject() {
        return subject;
    }

    public Tutor getTutor() {
        return tutor;
    }

    @Override
    public String toString() {
        return markType.getDescription()+'('+markType.getValue()+')';
    }

}
