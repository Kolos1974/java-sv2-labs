package references.parameters;

public class ReferencesMain {
    public static void main(String[] args) {
        Person person1 = new Person("Futó Dávid", 22);
        Person person2 = new Person("Kópolics Anita", 26);

        Person personUj = new Person("Kiss Gábor", 33);
        person1 = personUj;

        person2 = person1;

        person2.setName("Mindenki Ugyanaz");

        System.out.println("A person1 neve"+person1.getName()+", a kora: "+person1.getAge());
        System.out.println("A person2 neve"+person2.getName()+", a kora: "+person2.getAge());
        System.out.println("A personUj neve"+personUj.getName()+", a kora: "+personUj.getAge());
        System.out.println();

        int a;
        int b;
        a = 24;
        b = a;
        b +=1;
        System.out.println("Az a változó értéke: "+a);
        System.out.println("A b változó értéke: "+b);
        System.out.println();
        // Itt nem referencia, hanem érték lett átadva.

        Person personLast = new Person("Végső Áron", 78);
        person1 = personLast;

        System.out.println("A person1 neve: "+person1.getName()+", a kora: "+person1.getAge());
        System.out.println("A personLast neve: "+personLast.getName()+", a kora: "+personLast.getAge());
        // Itt a personLast referenciája lett átadva.

    }

}
