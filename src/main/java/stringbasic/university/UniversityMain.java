package stringbasic.university;

public class UniversityMain {

    public static void main(String[] args) {
        Person person1 = new Person("Kiss Géza", "kiss@gmail.com", "2315466", "11112222-33334444","06901234567");
        Person person2 = new Person("Nagy Kálmán", "nagy@gmail.com", "5421645","44445555-11112222","06305554441");
        Person person3 = new Person("Mézga Géza", "mezi@gmail.com", "22334466", "12345678-87654321","0023665959613");

        Student student1 = new Student(person1, "N154236","0002");
        Student student2 = new Student(person3, "N541695", "007");

        University university = new University();
        university.addStudent(student1);
        university.addStudent(student2);

        System.out.println(university.areEquals(student1, student2));
        System.out.println(university.areEquals(student2, student2));

    }
}
