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
        System.out.print(actual + ", ");
        for (int i = 0; i < piece-2; i++) {
            System.out.print(previous+actual+", ");
            int temp = previous;
            previous = actual;
            actual = temp+previous;
        }
    }
}
