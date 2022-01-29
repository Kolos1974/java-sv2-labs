package collectionsequalshash;

import java.util.ArrayList;
import java.util.List;

public class RegistryCourt {


    public static void main(String[] args) {
        List<Company> companies = new ArrayList<>();

        Company company1 = new Company("Cég Kft", "1234");
        Company company2 = new Company("Training360 Kft", "123456");
        Company company3 = new Company("PROGmasters", "999999");

        companies.add(company1);
        companies.add(company2);
        companies.add(company3);


        System.out.println(companies);
        System.out.println(companies.contains(new Company("Cég Kft","1234" )));
        System.out.println(companies.contains(new Company("Cég Kft","1333" )));
        System.out.println(companies.contains(new Company("Training360 Kft", "123456")));




    }

}
