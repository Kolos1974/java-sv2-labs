package statements;

import java.util.Scanner;

public class TimeMain {
    public static void main(String[] args) {
        Time timeFirst;
        Time timeSecond;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Please write the first time hours:");
        int firstTimeHours = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Please write the first time minutes:");
        int firstTimeMinutes = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Please write the first time seconds:");
        int firstTimeSeconds = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Please write the second time hours:");
        int secondTimeHours = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Please write the second time minutes:");
        int secondTimeMinutes = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Please write the second time seconds:");
        int secondTimeSeconds = scanner.nextInt();
        scanner.nextLine();

        timeFirst = new Time(firstTimeHours, firstTimeMinutes, firstTimeSeconds);
        timeSecond = new Time(secondTimeHours, secondTimeMinutes, secondTimeSeconds);

        System.out.println("Az első időpont "+timeFirst.toString()+" = "+timeFirst.getInMinutes()+" perc");
        System.out.println("A második időpont "+timeSecond.toString()+" = "+timeSecond.getInSeconds()+" másodperc");
        System.out.println("Az első korábbi, mint a második: "+timeFirst.earlierThan(timeSecond));




    }

}
