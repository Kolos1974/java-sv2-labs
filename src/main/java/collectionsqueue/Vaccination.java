package collectionsqueue;

import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;

public class Vaccination {

    public Queue<Integer> getVaccinationOrder(List<Person> people){
        PriorityQueue<Integer> result = new PriorityQueue<>();
        for (Person p : people){
            if ((p.getAge()>=18) && (p.getAge()<=65)){
                result.add(p.getAge());
            }
        }
        return result;
    }

    public static void main(String[] args) {
        Vaccination vaccination = new Vaccination();
        Person person1 = new Person("Béla", 56);
        Person person2 = new Person("Ági", 12);
        Person person3 = new Person("Lajos", 42);
        Person person4 = new Person("Kázmér", 26);
        Person person5 = new Person("Éva", 62);
        Person person6 = new Person("Olga", 66);
        Person person7 = new Person("Józsi", 21);
        Person person8 = new Person("Robi", 48);

        List<Person> persons = new ArrayList<>();
        persons.add(person1);
        persons.add(person2);
        persons.add(person3);
        persons.add(person4);
        persons.add(person5);
        persons.add(person6);
        persons.add(person7);
        persons.add(person8);
        for (Person p : persons){
            System.out.println(p.getName()+" "+p.getAge());
        }
        System.out.println(vaccination.getVaccinationOrder(persons));
        Queue<Integer> q = vaccination.getVaccinationOrder(persons);
        System.out.println(q);
        q.poll();
        System.out.println(q);
    }

}
