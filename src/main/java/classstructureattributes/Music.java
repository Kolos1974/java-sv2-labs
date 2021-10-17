package classstructureattributes;

import java.util.Scanner;

public class Music {
    public static void main(String[] args) {
        Song song = new Song();

        Scanner scanner = new Scanner(System.in);

        System.out.println("Please write your favourite band: ");
        song.band = scanner.nextLine();

        System.out.println("Please write teh music title: ");
        song.title = scanner.nextLine();

        System.out.println("Please write the music lenght:");
        song.length = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Your favourite music:");
        System.out.println(song.band+" - "+song.title+" ("+song.length+" perc)!");
    }
}
