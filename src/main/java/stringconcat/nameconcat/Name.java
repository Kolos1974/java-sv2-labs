package stringconcat.nameconcat;

public class Name {
    private String familyName;
    private String middleName;
    private String givenName;
    private Title title;

    public Name(String familyName, String middleName, String givenName, Title title) {
        this.familyName = familyName;
        this.middleName = middleName;
        this.givenName = givenName;
        this.title = title;
    }

    public Name(String familyName, String middleName, String givenName) {
        this.familyName = familyName;
        this.middleName = middleName;
        this.givenName = givenName;
    }

    public String concatNameWesternStyle(){
        String result = "";
        if (!(this.title == null)) {
            result = result.concat(this.title.name());
        }
        result = result.concat(" " + this.givenName);
        result = result.concat(" "+this.middleName);
        result = result.concat(" "+this.familyName);
        return result;
    }

    public String concatNameHungarianStyle(){
        String result = "";
        if (!(this.title == null)) {
            result += this.title;
        }
        result += " "+this.familyName;
        result += " "+this.middleName;
        result += " "+this.givenName;
        return result;
    }

}
