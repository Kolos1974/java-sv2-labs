package projects.schoolrecords;

public enum MarkType {
    A(5, "excellent"), B(4, "very good"), C(3, "improvement needed"), D(2, "close fail"), F(1, "fail");

    private int value;
    private String text;


    MarkType(int value, String text) {
        this.value = value;
        this.text = text;
    }

    static MarkType getMarkType(String text){
        for (MarkType element : MarkType.values()){
            if (element.text.equals(text)){
                return element;
            }
        }
        return null;
    }

    public int getValue() {
        return value;
    }

    public String getText() {
        return text;
    }
}
