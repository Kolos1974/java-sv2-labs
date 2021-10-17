package classstructureconstructors;

public class StoreMain {
    public static void main(String[] args) {
        Store firstStore = new Store("Monitor");
        Store secondStore = new Store("Processor");

        firstStore.setStock(3);
        secondStore.setStock(6);

        System.out.println(firstStore.toString());
        System.out.println(secondStore.toString());

        firstStore.dispatch(1);
        secondStore.dispatch(2);

        System.out.println(firstStore.toString());
        System.out.println(secondStore.toString());
    }
}
