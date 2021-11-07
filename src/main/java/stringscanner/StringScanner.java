package stringscanner;

import java.util.Scanner;

public class StringScanner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Kérem írjon be egy mondatot:");
        String s = scanner.nextLine();
        Scanner scannerByWords = new Scanner(s);
        while (scannerByWords.hasNext()){
            System.out.println(scannerByWords.next());
        }

        System.out.println("Kérem adjon meg egy másik mondatot:");
        s = scanner.nextLine();
        Scanner scannerOther = new Scanner(s).useDelimiter(", ");
        while (scannerOther.hasNext()){
            System.out.println(scannerOther.next());
        }



    }
}
