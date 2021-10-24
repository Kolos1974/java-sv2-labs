package introcontrol;

import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        int sum = 0;

        Scanner scanner = new Scanner(System.in);

        for (int i=1; i<=5; i++){
            System.out.println("Please write the "+i+". number:");
            int number = scanner.nextInt();
            sum = sum + number;
        }

        System.out.println("The numbers sum : "+sum);
    }

}
