package classstructureconstructors;

public class BookMain {
    public static void main(String[] args) {
        Book book = new Book("Stolniczki Gyula", "SQL kézikönyv");

        book.register("NKO152684");

        System.out.println("Szerző: "+book.getAuthor()+", címe: "+book.getTitle()+", regszám: "+book.getRegNumber());

    }

}
