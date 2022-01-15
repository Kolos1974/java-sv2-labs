package introexceptionfinally;

import java.util.Scanner;

public class Numbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = 0;
        do {
            try {
                System.out.println("Adjon meg egy számot!");
                number = Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException nfe){
                throw new IllegalArgumentException("Nem számot adott mewg!!", nfe);
            } finally {
                System.out.println("End of round.");
            }
        } while (!((number%2)==0));




    }


}
