package classstructureattributes;

import java.util.Scanner;

public class ClientMain {
    public static void main(String[] args) {
        Client client = new Client();

        Scanner scanner = new Scanner(System.in);

        System.out.println("Please write your name: ");
        String name = scanner.nextLine();

        System.out.println("Please write your birth year: ");
        int year = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Please write your address: ");
        String address = scanner.nextLine();

        System.out.println("Your details:");
        System.out.println("Name: "+name);
        System.out.println("Birth year: "+year);
        System.out.println("Address: "+address);
    }
}
