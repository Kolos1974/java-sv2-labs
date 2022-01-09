package projects.catalog;

import java.util.List;

public class PrintedFeatures implements Feature {
    private List<String> authors;
    private int numberOfPages;
    private String title;

    public PrintedFeatures(String title, int numberOfPages, List<String> authors) {
        this.title = title;
        this.numberOfPages = numberOfPages;
        this.authors = authors;
    }

    @Override
    public List<String> getContributors() {
        return authors;
    }

    @Override
    public String getTitle() {
        return title;
    }

    public int getNumberOfPages() {
        return numberOfPages;
    }
}
