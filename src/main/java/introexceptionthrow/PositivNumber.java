package introexceptionthrow;

import java.util.Scanner;

public class PositivNumber {
    public static void main(String[] args) {
        int number;
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.println("Adjon meg egy számot:");
             number = Integer.parseInt(scanner.nextLine());
        } catch (NumberFormatException nfe){
            throw new NumberFormatException("A megadott érték nem szám!!");
        }
        System.out.println("A megadott szám: "+number);
    }


}
