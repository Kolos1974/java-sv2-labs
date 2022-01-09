package projects.catalog;

import java.util.List;

public class AudioFeatures implements Feature{
    private List<String> composer;
    private int length;
    private List<String> performers;
    private String title;

    public AudioFeatures(String title, int length, List<String> composer) {
        this.title = title;
        this.length = length;
        this.composer = composer;

    }

    public AudioFeatures(String title, int length, List<String> composer, List<String> performers) {
        this.title = title;
        this.length = length;
        this.composer = composer;
        this.performers = performers;

    }

    @Override
    public List<String> getContributors() {
        return null;
    }

    @Override
    public String getTitle() {
        return null;
    }

    public int getLength() {
        return length;
    }
}
