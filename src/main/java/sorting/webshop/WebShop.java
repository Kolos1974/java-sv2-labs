package sorting.webshop;

import java.util.*;

public class WebShop {
    private List<Product> products = new ArrayList<>();

    public void addProducts(Product product){
        products.add(product);
    }

    public void addProducts(Product... product) {
        products.addAll(Arrays.asList(product));
    }

    public List<Product> getProductsOrderByName(){
        List<Product> result = new ArrayList<>(products);
        Collections.sort(result, new Comparator<Product>() {
            @Override
            public int compare(Product o1, Product o2) {
                return o1.getName().compareTo(o2.getName());
            }
        });

        return result;
    }

    public List<Product> getProductsOrderByDate(){
        List<Product> result = new ArrayList<>(products);
        Collections.sort(result, new Comparator<Product>() {
            @Override
            public int compare(Product o1, Product o2) {
                return o1.getFrom().compareTo(o2.getFrom());
            }
        });
        return result;
    }

    public List<Product> getProductsOrderByPrice(){
        List<Product> result = new ArrayList<>(products);
        Collections.sort(result, new Comparator<Product>() {
            @Override
            public int compare(Product o1, Product o2) {
                return ((Integer) o1.getPrice()).compareTo((Integer) o2.getPrice());
            }
        });
        return result;
    }


    public static void main(String[] args) {
        WebShop webShop = new WebShop();
        webShop.getProductsOrderByName();
    }
}
