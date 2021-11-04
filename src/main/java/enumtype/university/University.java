package enumtype.university;

public enum University {
    BME("BUDAPESTI MŰSZAKI EGYETEM"), BCE ("BUDAPESTI CORVINUS EGYETEM"), PE ("PANNON EGYETEM");

    private final String name;

    University(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
