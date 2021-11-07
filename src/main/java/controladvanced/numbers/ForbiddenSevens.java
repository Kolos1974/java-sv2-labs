package controladvanced.numbers;

import java.util.Scanner;

public class ForbiddenSevens {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Kérem adjon meg egy számot:");
        int number = scanner.nextInt();

        for (int i = number; i>=number; i++){
            if (i % 7 == 0){
                System.out.println("X");
                continue;
            }
            if (Integer.toString(i).contains("7")){
                break;
            }
            System.out.println(i);
        }



    }

}
