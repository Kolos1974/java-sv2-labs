package composition.realestate;

import composition.realestate.Address;

public class RealEstateDotCom {
    public static void main(String[] args) {
        Address address = new Address("Budapest", "1111", "Menyecske", 10);
        System.out.println(address);

        Details details = new Details("Közepes állípotú", address, 49, 46);
        System.out.println(details);

        RealEstate realEstate = new RealEstate("Eladó lakás", 35000000, details);
        System.out.println(realEstate);

    }

}
