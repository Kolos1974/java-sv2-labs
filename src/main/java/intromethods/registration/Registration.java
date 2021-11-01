package intromethods.registration;

import java.time.LocalDate;
import java.util.Scanner;

public class Registration {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Adja meg a vezetéknevét:");
        String vezNev = scanner.nextLine();
        System.out.println("Adja meg a keresztnevét:");
        String kerNev = scanner.nextLine();
        System.out.println("Adja meg a születési évét:");
        int szulEv = scanner.nextInt();
        System.out.println("Adja meg a születési hónapját:");
        int szulHo = scanner.nextInt();
        System.out.println("Adja meg a születési napját:");
        int szulNap = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Adja meg az email címét:");
        String email = scanner.nextLine();

        Registration reg = new Registration();

        Person person = new Person(reg.fullName(vezNev, kerNev), reg.fullBirthday(szulEv, szulHo, szulNap), email);
        System.out.println(person);
    }

    public String fullName(String firstName, String lastName){
        return firstName+" "+lastName;
    }

    public LocalDate fullBirthday(int ev, int ho, int nap){
        return LocalDate.of(ev, ho, nap);
    }



}
