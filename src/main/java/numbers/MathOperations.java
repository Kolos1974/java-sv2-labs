package numbers;

import java.util.Scanner;

public class MathOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.println("A feladvány : 12 - 3 / 4 * 3 ");

        double result = 12 - 3 /4.0 * 3;

        System.out.println("Kérem adja meg az eredményt:");
        double resultGuess = scanner.nextDouble();

        if (Math.abs(result-resultGuess)<0.000005){
            System.out.println("A tippje helyes!");
        } else {
            System.out.println("A tippje helytelen!");
        }


    }
}
