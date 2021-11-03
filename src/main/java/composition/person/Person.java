package composition.person;

public class Person {
    String name;
    String identificationaCard;

    Address address;

    public String personToString(){
        return "Name: "+name+", id card: "+identificationaCard;
    }

    public Person(String name, String identificationaCard) {
        this.name = name;
        this.identificationaCard = identificationaCard;
    }

    public String getName() {
        return name;
    }

    public String getIdentificationaCard() {
        return identificationaCard;
    }

    public void correctData(String nam, String ide){
        name = nam;
        identificationaCard = ide;
    }

    public void moveTo(Address ad){
        address = ad;
    }

    public Address getAddress(){
        return address;
    }

}
