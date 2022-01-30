package streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Read {
    private List<Book> books = new ArrayList<>();

    public void addBook(Book book){
        books.add(book);
    }

    public List<String> listBookTitlesShorterThanGiven(int maxNumberPages){
        return books.stream()
                .filter(book -> book.getPages()<maxNumberPages)
               // .map(book->book.getTitle())
                .map(Book::getTitle)
                .collect(Collectors.toList());
    }

    public List<String> listBookTitlesWithGivenAuthor(String author) {
        return books.stream()
                .filter(book ->book.getAuthor().equals(author))
                //.map(book->book.getTitle())
                .map(Book::getTitle)
                .sorted()
                .collect(Collectors.toList());
    }

    public List<String> listAuthors(){
        return books.stream()
                //.map(book->book.getAuthor())
                .map(Book::getAuthor)
                .distinct()
                .collect(Collectors.toList());
    }


}
