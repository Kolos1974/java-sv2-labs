package controliteration.division;

import enumtype.solarsystem.SolarSystem;

import java.util.Scanner;

public class Division {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Adjpon meg egy pozitív egész számot:");
        int number = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Hánnyal osztható számokat szeretne kapni?");
        int divider = scanner.nextInt();

        for (int i = 1; i<=number; i++){
            if (i%divider==0) {
                System.out.print(i);
                System.out.print(", ");
            }
        }
        System.out.println();

        int i= 1;
        while (i<=number){
            if (i%divider==0) {
                System.out.print(i);
                System.out.print(", ");
            }
            i++;
        }



    }
}
