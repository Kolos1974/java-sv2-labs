package collectionsequalshash;

import java.util.ArrayList;
import java.util.List;

public class WebShop {
    public List<Product> products = new ArrayList<>();


    public int findHowMany(Product product){
        int result = 0;
        for (Product element: products){
            if (element.equals(product)){
                result++;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        WebShop webShop = new WebShop();
        webShop.products.add(new Product("síléc", "123456"));
        webShop.products.add(new Product("sisak", "222333"));
        webShop.products.add(new Product("Síbakancs", "123456"));

        for (Product element : webShop.products){
            System.out.println(element.getName()+" "+element.getId());
        }

        System.out.println(webShop.findHowMany(new Product("síkabát","333333")));
        System.out.println(webShop.findHowMany(new Product("aláöltöző", "123456")));


    }

}
