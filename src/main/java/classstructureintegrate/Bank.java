package classstructureintegrate;

import java.util.Scanner;

public class Bank {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please write the accountnumber: ");
        String accountNumber = scanner.nextLine();

        System.out.println("Please write the owner:");
        String owner = scanner.nextLine();

        System.out.println("Please write the balance:");
        int balance = scanner.nextInt();
        scanner.nextLine();

        BankAccount bankAccount = new BankAccount(accountNumber, owner, balance);

        System.out.println(bankAccount.getInfo());
        bankAccount.deposit(65012);
        System.out.println(bankAccount.getInfo());
        bankAccount.withdraw(8450);
        System.out.println(bankAccount.getInfo());

    }
}
