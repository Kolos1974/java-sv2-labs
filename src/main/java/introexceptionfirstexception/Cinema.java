package introexceptionfirstexception;

import java.util.Scanner;

public class Cinema {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("A vásárló neve:");
        String name = scanner.nextLine();
        System.out.println("Melyik fimlre kér jegyet:");
        String filmTitle = scanner.nextLine();
        System.out.println("Melyik sorba kéri a jegyet?");
        int lineNumber = Integer.parseInt(scanner.nextLine());
        System.out.println("Hány darab jegyet kér?");
        int ticketNumber = Integer.parseInt(scanner.nextLine());

        System.out.println("A mozijegy.hu rendszerben vásárolt jegyek adatai a következők:");
        System.out.println("Vásárló neve: "+name);
        System.out.println("Film címee: "+filmTitle);
        System.out.print("Lefoglalt helyek: ");
        for (int i=1; i<=ticketNumber; i++){
            System.out.print(lineNumber+". sor "+i+". szék");
            if (i<ticketNumber){
                System.out.print(", ");
            }
        }
        System.out.println("");
        System.out.println("Jó szórakozást!");

    }

}
