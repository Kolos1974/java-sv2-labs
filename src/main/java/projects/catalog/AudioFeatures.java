package projects.catalog;

import java.util.ArrayList;
import java.util.List;

public class AudioFeatures implements Feature {
    private List<String> composer;
    private int length;
    private List<String> performers;
    private String title;

    public AudioFeatures(String title, int length, List<String> composer) {
        if (Validators.isBlank(title)){
            throw new IllegalArgumentException("Title is empty!");
        }
        if (length<=0){
            throw new IllegalArgumentException("Length is wrong value");
        }
        this.title = title;
        this.length = length;
        this.composer = composer;

    }

    public AudioFeatures(String title, int length, List<String> performers, List<String> composer) {
        this.title = title;
        this.length = length;
        this.composer = composer;
        this.performers = performers;

    }

    @Override
    public List<String> getContributors() {
        List<String> result = new ArrayList<>();
        if (!(Validators.isEmpty(composer))) {
            result.addAll(composer);
        }
        if (!(Validators.isEmpty(performers))) {
            result.addAll(performers);
        }
        return result;
    }

    @Override
    public String getTitle() {
        return title;
    }

    public int getLength() {
        return length;
    }
}
