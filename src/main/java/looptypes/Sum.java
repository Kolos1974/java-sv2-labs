package looptypes;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Sum {
    public static void main(String[] args) {
        Sum sum = new Sum();
        int[] numbers = {2, 6, 3, 5, 7, 9};
        System.out.println("A tömb mérete: "+numbers.length+" db");
        System.out.println("A tömb elemei: ");
        for (int element: numbers){
            System.out.print(element+", ");
        }

        System.out.println();
        sum.printSums(numbers);
    }

    public void printSums(int[] numbers){
        System.out.println("A szomszéd elemek összegei:");
        for (int i =0; i<numbers.length-1; i++){
            System.out.print(numbers[i]+numbers[i+1]+", ");
        }
    }
}
