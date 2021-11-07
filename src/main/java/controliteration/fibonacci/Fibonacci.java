package controliteration.fibonacci;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Adja meg, hogy hány darab fibonacci számot szeretne!");
        int piece = scanner.nextInt();

        // TODO Repair!!
        int previous = 0;
        int actual = 1;
        System.out.print(previous + ", ");
        for (int i = 1; i < piece; i++) {
            System.out.print(previous + ", ");
            previous = actual;
            actual = actual + previous;
        }


    }
}
