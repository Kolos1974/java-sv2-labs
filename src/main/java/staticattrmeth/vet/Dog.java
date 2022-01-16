package staticattrmeth.vet;

public class Dog {
    private String name;
    private int age;
    private Species kind;
    private long idNumber;

    public Dog(String name, int age, Species kind) {
        this.name = name;
        this.age = age;
        this.kind = kind;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public Species getKind() {
        return kind;
    }

    public long getIdNumber() {
        return idNumber;
    }

    public void setIdNumber(long idNumber) {
        this.idNumber = idNumber;
    }
}
