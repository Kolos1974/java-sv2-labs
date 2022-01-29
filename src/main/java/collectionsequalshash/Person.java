package collectionsequalshash;

import java.util.Objects;

public class Person {
    private String name;
    private int age;
    private String TAJ;

    public Person(String name, int age, String TAJ) {
        this.name = name;
        this.age = age;
        this.TAJ = TAJ;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getTAJ() {
        return TAJ;
    }

    public void setTAJ(String TAJ) {
        this.TAJ = TAJ;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return Objects.equals(TAJ, person.TAJ);
    }

    @Override
    public int hashCode() {
        return Objects.hash(TAJ);
    }

    public static void main(String[] args) {
        Person person1 = new Person("Béla", 25, "123456");
        Person person2 = new Person("Géza", 25, "123456");
        Person person3 = new Person("Béla", 25, "654123");


        System.out.println(person1.equals(person2));
        System.out.println(person1.equals(person3));
        System.out.println(person2.equals(person3));

        System.out.println(person1.hashCode());
        System.out.println(person2.hashCode());
        System.out.println(person3.hashCode());


    }
}
