package attributes.bill;

public class Bill {
    public static void main(String[] args) {
        BillItem billItem1 = new BillItem("Heineken sör",480, 6, 27);
        System.out.println("A sörös pack ára: "+billItem1.calculateTotalPrice());

        BillItem billItem2 = new BillItem("Kifli",35, 4, 12);
        System.out.println("A kifli ára: "+billItem2.calculateTotalPrice());

        BillItem billItem3 = new BillItem("Csokoládé",620, 2, 27);
        System.out.println("A csokoládé ára: "+billItem3.calculateTotalPrice());

    }
}
