package projects.catalog;

public class SearchCriteria {
    private String contributor;
    private String title;

    public SearchCriteria(String contributor, String title) {
        this.contributor = contributor;
        this.title = title;
    }

    public String getContributor() {
        return contributor;
    }

    public String getTitle() {
        return title;
    }

    public boolean hasContributor(){
        return true;
    }

    public boolean hasTitle(){
        return true;
    }

    /*
    public SearchCriteria createByBoth(String contributor, String title){

    }

    public SearchCriteria createByContributor(String contributor){

    }

    public SearchCriteria createByTitle(String title){

    }
    */
}
