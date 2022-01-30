package searching;

import java.util.Collections;
import java.util.List;

public class BookSearch {

    private List<Book> books;

    public BookSearch(List<Book> books) {
        this.books = books;
    }

    public Book findBookByAuthorTitle(String author, String title){
        if ((author== null) || (title==null) || (author.isEmpty()) || (title.isEmpty())){
            throw new IllegalArgumentException("Author or title must not be empty!");
        }
        Book find = new Book(author, title);

        int result = Collections.binarySearch(books, find);
        if (result<0){
            throw new IllegalArgumentException("No book found by " + author + " with title " + title);
        }
        return books.get(result);
    }





}
