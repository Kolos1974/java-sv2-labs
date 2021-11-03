package compositionlist;

import java.util.ArrayList;
import java.util.List;

public class Books {
    private List<String> titles = new ArrayList<>();

    public void addBook(String title){
        this.titles.add(title);
    }

    public void findBookAndSetAuthor(String title, String author){
        if (false) {
            int position = 0;
            boolean found = false;
            for (int i = 0; i < titles.size() - 1; i++) {
                if (title.equals(titles.get(i))) {
                    position = i;
                    found = true;
                }
            }
            if (found) {
                titles.set(position, author + ":" + titles.get(position));
            }
        } else {
            boolean found = titles.contains(title);
            if (found){
                int position = titles.indexOf(title);
                titles.set(position, author + ":" + titles.get(position));
            }
        }
    }

    public List<String> getTitles(){
        return titles;
    }

    public static void main(String[] args) {
        Books books = new Books();
        books.addBook("Balaton");
        books.addBook("Égi kalauz");
        System.out.println(books.getTitles());
        books.findBookAndSetAuthor("Balaton", "Zsiga Henrik");
        System.out.println(books.getTitles());
    }

}
