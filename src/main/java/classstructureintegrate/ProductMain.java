package classstructureintegrate;

import java.util.Scanner;

public class ProductMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please write the product name: ");
        String name = scanner.nextLine();

        System.out.println("Please write the price:");
        int price = scanner.nextInt();
        scanner.nextLine();

        Product product = new Product(name, price);

        System.out.println("The product: "+product.getName()+", the price: "+product.getPrice());

        product.increasePrice(4);

        System.out.println("The product: "+product.getName()+", the price: "+product.getPrice());

        product.decreasePrice(2);

        System.out.println("The product: "+product.getName()+", the price: "+product.getPrice());
    }

}
