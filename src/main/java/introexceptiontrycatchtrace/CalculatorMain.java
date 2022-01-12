package introexceptiontrycatchtrace;

import java.util.Scanner;

public class CalculatorMain {

    public static void main(String[] args) {
        int firstNumber = 0;
        int secondNumber = 0;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Az első szám:");
        try {
            firstNumber = Integer.parseInt(scanner.nextLine());
        }catch (NumberFormatException nfe){
            nfe.printStackTrace();
        }
        System.out.println("A másik szám:");
        try {
            secondNumber = Integer.parseInt(scanner.nextLine());
        }catch (NumberFormatException nfe){
            nfe.printStackTrace();
        }

        System.out.println("A művelet:");
        String task = scanner.nextLine();

        Calculator calculator = new Calculator();
        System.out.println("Az eredmény: "+calculator.Calculate(firstNumber, secondNumber, task));

    }
}
