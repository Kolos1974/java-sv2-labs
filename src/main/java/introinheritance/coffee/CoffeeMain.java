package introinheritance.coffee;

public class CoffeeMain {

    public static void main(String[] args) {
        Coffee coffee = new Coffee();
        coffee.setName("Arabica");
        coffee.setPrice(2600);
        System.out.println(coffee.getName()+" : "+coffee.getPrice()+" Ft");

        Cappuccino cappuccino = new Cappuccino();
        cappuccino.setName("Segafredo");
        cappuccino.setPrice(1500);
        System.out.println(cappuccino.getName()+" : "+cappuccino.getPrice()+" Ft");

        System.out.println(coffee.getName()+" : "+coffee.getPrice()+" Ft");

    }
}
