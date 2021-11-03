package composition.person;

public class PersonMain {
    public static void main(String[] args) {
        Person person = new Person("Kiss Béla", "123456");
        System.out.println("Person: "+person.getName()+", id: "+person.getIdentificationaCard());
        System.out.println();

        Address address = new Address("Hungary", "Budapest", "Bartók", "1111");

        System.out.println(person.getAddress());
        person.moveTo(address);
        System.out.println(person.getAddress().getCity());



    }

}
