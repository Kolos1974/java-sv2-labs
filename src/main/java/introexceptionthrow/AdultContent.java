package introexceptionthrow;

public class AdultContent {

    public static void main(String[] args) {
        Adult adult = new Adult("Felnőtt",28);
        System.out.println(adult.getName()+" "+adult.getAge());
        Adult young = new Adult("Fiatal", 12);
        System.out.println(young.getName()+" "+young.getAge());

    }
}
