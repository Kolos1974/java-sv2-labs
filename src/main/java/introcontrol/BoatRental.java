package introcontrol;

import java.util.Scanner;

public class BoatRental {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please write the people numbers:");
        int peoples = scanner.nextInt();

        if (peoples>10) {
            System.out.println(""+(peoples-10)+" people stay at the beach!");
        }
        else {
            if (peoples==9) {
                System.out.println("Taken all boat!");
            }
            if (peoples==8) {
                System.out.println("Taken the 5 and 3 boat! Rest for 2 people!");
            }
            if ((peoples==7) || (peoples==6)) {
                System.out.println("Taken the 5 and 2 boat! Rest for 3 people!");
            }
            if ((peoples==5) || (peoples==4)) {
                System.out.println("Taken the 5 boat! Rest for 3 and 2 people!");
            }
            if (peoples==3) {
                System.out.println("Taken the 3 boat! Rest for 5 and 2 people!");
            }
            if ((peoples==2) || (peoples==1)) {
                System.out.println("Taken the 2 boat! Rest for 5 and 3 people!");
            }
        }
    }
}
