package introexceptionthrow;

import java.util.Scanner;

public class Registration {
    public static void main(String[] args) {
        Validation validation = new Validation();
        boolean sucess = true;

        System.out.println("Üdvözlöm!!");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Kérem adja meg a nevét!");
        String name = scanner.nextLine();

        try {
            validation.validateName(name);
        } catch (IllegalArgumentException iae) {
            System.out.println("A nevet ki kell tölteni!");
            sucess = false;
        }

        System.out.println("Kérem adja meg a korát:");
        String ageString;
        int age = 0;
        try {
            ageString =  scanner.nextLine();
            validation.validateAge(ageString);
            age = Integer.parseInt(ageString);
        } catch (IllegalArgumentException iae){
            System.out.println("Nem számértéket adott meg!");
            sucess = false;
        }

        System.out.println("A megadott név: "+name);
        System.out.println("A megadott kor: "+age);

        if (sucess){
            System.out.println("A regisztráció sikeres!");
        } else {
            System.out.println("A regisztráció sikertelen!");
        }


    }


}
