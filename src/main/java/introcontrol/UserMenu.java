package introcontrol;

import java.util.Scanner;

public class UserMenu {
    public static void main(String[] args) {
        String menu1 = "1. Felhasználók listázása";
        String menu2 = "2. Felhasználó felvétele";

        System.out.println(menu1);
        System.out.println(menu2);
        System.out.println("Többi: Kilépés");

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please choose a menu: ");
        int menu = scanner.nextInt();

        if (menu==1){
            System.out.println(menu1);
        }
        else if (menu==2){
            System.out.println(menu2);
        }
    }
}
