package primitivetypes.exam;

import java.time.LocalDate;

public class Person {
    private String name;
    private LocalDate birthDay;
    private int postCode;
    private double average;


    public Person(String name, LocalDate birthDay, int postCode, double average) {
        this.name = name;
        this.birthDay = birthDay;
        this.postCode = postCode;
        this.average = average;
    }

    public String getName() {
        return name;
    }

    public LocalDate getBirthDay() {
        return birthDay;
    }

    public int getPostCode() {
        return postCode;
    }

    public double getAverage() {
        return average;
    }

    @Override
    public String toString() {
        return "Person adatai{" +
                "name='" + name + '\'' +
                ", birthDay=" + birthDay +
                ", postCode=" + postCode +
                ", average=" + average +
                '}';
    }
}
