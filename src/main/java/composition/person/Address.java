package composition.person;

public class Address {
    String country;
    String city;
    String streetAndNumber;
    String zipCode;

    public String addressToString(){
        return "Country: "+country+", city: "+city+", stNum: "+streetAndNumber+", zipCode: "+zipCode;
    }

    public Address(String country, String city, String streetAndNumber, String zipCode) {
        this.country = country;
        this.city = city;
        this.streetAndNumber = streetAndNumber;
        this.zipCode = zipCode;
    }

    public String getCountry() {
        return country;
    }

    public String getCity() {
        return city;
    }

    public String getStreetAndNumber() {
        return streetAndNumber;
    }

    public String getZipCode() {
        return zipCode;
    }

    public void correctData(String cou, String cit, String str, String zip){
        country = cou;
        city= cit;
        streetAndNumber= str;
        zipCode= zip;
    }
}
