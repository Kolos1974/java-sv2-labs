package introcontrol;

import java.util.Scanner;

public class BoatRental {
    public static void main(String[] args) {
/*
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
*/

        int boat1Capacity = 5;
        int boat2Capacity = 3;
        int boat3Capacity = 2;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Hány fős csoport érkezett?");
        int numberOfPeople = scanner.nextInt();

        int freePlaces = 10;
        int freeBoats = 3;

        if (numberOfPeople > 3) {
            System.out.println("5-ös csónak");
            numberOfPeople = numberOfPeople - 5;
            freeBoats--;
            freePlaces = freePlaces - 5;
        }
        if (numberOfPeople > 2) {
            System.out.println("3-as csónak");
            numberOfPeople = numberOfPeople - 3;
            freeBoats--;
            freePlaces = freePlaces - 3;
        }
        if (numberOfPeople > 0) {
            System.out.println("2-es csónak");
            numberOfPeople = numberOfPeople - 2;
            freeBoats--;
            freePlaces = freePlaces - 2;
        }
        if (numberOfPeople > 0) {
            System.out.println("Sajnos nem fért el mindenki a hajókban.");
        } else {
            System.out.println("Üres helyek száma: " + freePlaces);
            System.out.println("Üres csónakok száma: " + freeBoats);
        }

    }
}
