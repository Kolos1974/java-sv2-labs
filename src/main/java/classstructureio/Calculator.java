package classstructureio;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("This is a calculator!");
        System.out.println("Please write the first number:");
        int firstNumber = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Please write the second number:");
        int secondNumber = scanner.nextInt();
        scanner.nextLine();

        System.out.println("The calculate numbers: "+firstNumber+" + "+secondNumber);
        System.out.println("The result is: "+(firstNumber+secondNumber));
    }
}
