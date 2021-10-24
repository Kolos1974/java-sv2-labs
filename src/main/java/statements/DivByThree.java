package statements;

import java.util.Scanner;

public class DivByThree {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please write a number:");
        int number = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Osztható-e a szám 3-al? "+(number==((number/3)*3) ? true: false));

    }


}
