package stringbasic.university;

public class Student {
    private Person person;
    private String neptunId;
    private String learnId;
    private String enterCard;

    public Student(Person person, String neptunId, String learnId) {
        this.person = person;
        this.neptunId = neptunId;
        this.learnId = learnId;
    }

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    public String getNeptunId() {
        return neptunId;
    }

    public void setNeptunId(String neptunId) {
        this.neptunId = neptunId;
    }

    public String getLearnId() {
        return learnId;
    }

    public void setLearnId(String learnId) {
        this.learnId = learnId;
    }

    public String getEnterCard() {
        return enterCard;
    }

    public void setEnterCard(String enterCard) {
        this.enterCard = enterCard;
    }
}
