package classstructureio;

import java.util.Scanner;

public class Registration {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please write your name: ");
        String name = scanner.nextLine();

        System.out.println("Please write your email address: ");
        String email = scanner.nextLine();

        System.out.println("Your details:");
        System.out.println("Name : "+name);
        System.out.println("Email: "+email);
    }

}
