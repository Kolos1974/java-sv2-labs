package introexceptiontrycatch;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        int first = 0;
        int second = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Az első szám:");
        try {
            first = Integer.parseInt(scanner.nextLine());
        } catch (NumberFormatException nfe){
            System.out.println(nfe.getMessage());
        }
        System.out.println("A másik szám:");
        try {
            second = Integer.parseInt(scanner.nextLine());
        }catch (NumberFormatException nfe){
            System.out.println(nfe.getMessage());
        }
        System.out.println("A művelet?");
        String task = scanner.nextLine();
        int result = 0;

        try {
            if (task.equals("+")) {
                result = first + second;
            }
            if (task.equals("-")) {
                result = first - second;
            }
            if (task.equals("*")) {
                result = first * second;
            }
            if (task.equals("/")) {
                result = first / second;
            }
        //}catch (Exception e){
        }catch (ArithmeticException  e){
            System.out.println(e.getMessage());
        }
        System.out.println("Az eredmény: " + result);
    }

}
