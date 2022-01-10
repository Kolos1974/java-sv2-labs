package projects.catalog;

import java.util.ArrayList;
import java.util.List;

public class Catalog {
    List<CatalogItem> catalogItems = new ArrayList<>();

    public void addItem(CatalogItem catalogItem){
        catalogItems.add(catalogItem);
    }

    public double averagePageNumberOver(int i){
        if (i<= 0){
            throw new IllegalArgumentException("Page number must be positive");
        }

        int allPages = 0;
        int number = 0;
        for (CatalogItem catalogItem : catalogItems){
            int pages = catalogItem.numberOfPagesAtOneItem();
            if (pages>i){
                allPages = allPages + pages;
                number++;
            }
        }
        if (number == 0){
            throw new IllegalArgumentException("No page");
        }
        double result = allPages/number;
        return result;

    }

    public void deleteItemByRegistrationNumber(String registrationNumber){
        List<CatalogItem> list = new ArrayList<>();
        for (CatalogItem element : catalogItems){
            if (element.getRegistrationNumber().equals(registrationNumber)){
                list.add(element);
            }
        }
        catalogItems.removeAll(list);
    }
    public List<CatalogItem> findByCriteria(SearchCriteria searchCriteria){
        List<CatalogItem> result = new ArrayList<>();
        for (CatalogItem catalogItem : catalogItems){
            if (((!(searchCriteria.hasTitle()) || catalogItem.getTitles().contains(searchCriteria.getTitle()))) &&
            ((!(searchCriteria.hasContributor()) || catalogItem.getContributors().contains(searchCriteria.getContributor())))){
                result.add(catalogItem);
            }
        }
        return result;
    }


    public int getAllPageNumber(){
        int pages = 0;
        for (CatalogItem catalogItem : catalogItems){
            pages = pages + catalogItem.numberOfPagesAtOneItem();
        }
        return pages;
    }

    public List<CatalogItem> getAudioLibraryItems(){
        Catalog catalog = new Catalog();
        for (CatalogItem catalogItem : catalogItems){
            if (catalogItem.hasAudioFeature()){
                catalog.addItem(catalogItem);
            }
        }
        return catalog.catalogItems;
    }

    public int getFullLength(){
        int fullLength = 0;
        for (CatalogItem catalogItem : catalogItems){
            fullLength = fullLength + catalogItem.fullLengthAtOneItem();
        }
        return fullLength;
    }

    public List<CatalogItem> getPrintedLibraryItems(){
        List<CatalogItem> list = new ArrayList<>();
        for (CatalogItem catalogItem : catalogItems){
            if (catalogItem.hasPrintedFeature()){
                list.add(catalogItem);
            }
        }
        return list;
    }
}
