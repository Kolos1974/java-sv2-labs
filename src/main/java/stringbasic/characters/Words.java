package stringbasic.characters;

import java.util.Scanner;

public class Words {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String word;
        System.out.println("Adja meg a kiinduló szót: ");
        word = scanner.nextLine();

        System.out.println();
        System.out.println("Adja meg egyenként a betűket!");
        String guess="";
        for (int i = 0; i<word.length(); i++){
            String s = scanner.nextLine();
            char[] temp = s.toCharArray();
            char c = temp[0];
            guess = (guess + Character.toString(c));
        }
        if (guess.equals(word)) {
            System.out.println("A válasz helyes");
        } else {
            System.out.println("A válasz helytelen");
        }

    }

}
