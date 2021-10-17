package classstructuremethods;

public class ClientMain {
    public static void main(String[] args) {
        Client client = new Client();

        client.setName("Joe Biden");
        client.setAddress("Pennsylvania");
        client.setYear(1942);

        System.out.println("A kliens adatai: Név: "+client.getName()+", címe: "+client.getAddress()+
                ", születési éve: "+client.getYear());

        client.migrate("Washington");

        System.out.println("A cím megváltozott. Az új cím: "+client.getAddress());
    }

}
