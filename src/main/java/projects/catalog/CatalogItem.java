package projects.catalog;

import java.util.ArrayList;
import java.util.List;

public class CatalogItem {
    private List<Feature> features = new ArrayList();
    private int price;
    private String registrationNumber;

    public CatalogItem(String registrationNumber, int price, List<Feature> features) {
        this.features = features;
        this.price = price;
        this.registrationNumber = registrationNumber;
    }

    public List<Feature> getFeatures() {
        return features;
    }

    public int getPrice() {
        return price;
    }

    public String getRegistrationNumber() {
        return registrationNumber;
    }

    public List<String> getContributors(){
        return new ArrayList<>();
    }

    public List<String> getTitles(){
        return new ArrayList<>();
    }

    public int fullLengthAtOneItem(){

        return 0;
    }

    public boolean hasAudioFeature(){

        return true;
    }

    public boolean hasPrintedFeature(){

        return true;
    }

    public int numberOfPagesAtOneItem(){
        return 0;
    }
}
