package projects.catalog;

import java.util.ArrayList;
import java.util.List;

public class Catalog {
    private List<CatalogItem> catalogItems = new ArrayList<>();

    public void additem(CatalogItem catalogItem){
        catalogItems.add(catalogItem);
    }

    /*
    public double averagePageNumberOver(int i){

    }

    public void deleteItemByRegistrationNumber(String registrationNumber){

    }

    public List<CatalogItem> findByCriteria(SearchCriteria searchCriteria){

    }

    public int getAllPageNumber(){

    }

    public List<CatalogItem> getAudioLibraryItems(){

    }

    public int getFullLength(){

    }

    public List<CatalogItem> getPrintedLibraryItems(){

    }
    */
}
