package aslist;

import java.security.spec.RSAOtherPrimeInfo;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Favourites {

    public static void main(String[] args) {
        List<String> favouriteThings = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Kedvenc filmje: ");
        favouriteThings.add(scanner.nextLine());
        System.out.println("Kedvenc színésze: ");
        favouriteThings.add(scanner.nextLine());
        System.out.println("Kedvenc állata: ");
        favouriteThings.add(scanner.nextLine());

        System.out.println("A lista mérete: "+favouriteThings.size()+"db. A lista elemei: "+favouriteThings.toString());
        System.out.println();

        for (String element: favouriteThings){
            System.out.println(element);
        }
    }
}
