package array;

public class ArrayMain {
    public static void main(String[] args) {
        String[] week = {"Hétfő", "Kedd", "Szerda", "Csütörtök", "Péntek", "Szombat", "Vasárnap"};

        System.out.println(week[1]);
        System.out.println(week.length);

        int[] number = new int[5];  // A tömb elemszáma 5
        int power = 1;
        for (int i=0; i<5; i++){
            if (i == 0) {
                number[i] =power;
            } else {
                power = power*2;
                number[i] = power;
            }
        }

        for (int element : number) {
            System.out.print(element+" ");
        }

        boolean[] logic = new boolean[6];
        boolean boolElement = true;
        for (int i=0; i< logic.length; i++){
            logic[i] = !boolElement;
            boolElement = !boolElement;
        }

        System.out.println("");
        for (boolean element : logic) {
            System.out.print(element+" ");
        }
    }
}
