package objects;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ObjectMain {
    public static void main(String[] args) {
        Book book = new Book();

        System.out.println(new Book());

        Book emptyBook = null;
        System.out.println(emptyBook);

        if (emptyBook==null) {
            System.out.println("EmptyBook is "+emptyBook);
        }

        Book newBook = new Book();
        System.out.println(newBook);

        Book anotherBook = new Book();
        boolean result = (newBook==anotherBook);
        System.out.println(result);

        anotherBook = newBook;
        result = (newBook==anotherBook);
        System.out.println(result);

        /*----------------------*/

        Book[] books = {new Book(), new Book(), new Book()};

        List<Book> listBook =Arrays.asList(new Book(), new Book(), new Book());

        List<Book> emptyListBook = new ArrayList<>();
        emptyListBook.add(new Book());
        emptyListBook.add(new Book());
        emptyListBook.add(new Book());

        System.out.println("A tömb tartalma: "+books);
        System.out.println(Arrays.toString(books));

        System.out.println("A listbook tartalma: "+listBook);

        System.out.println("Az emptyListBook tartalma:");
        for(Book b: emptyListBook){
            System.out.print(b.toString()+", ");
        }
        System.out.println();
        System.out.println(emptyListBook);

    }
}
