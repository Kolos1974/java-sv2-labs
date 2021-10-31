package looptypesmodify;

import java.util.Arrays;

public class EveryThird {
    public static void main(String[] args) {
        EveryThird everyThird = new EveryThird();
        //int[] num = new int[]{2, 6, 3, 5, 7, 2, 6, 2, 3, 5, 7, 3, 2, 9};
        int[] num = {2, 6, 3, 5, 7, 2, 6, 2, 3, 5, 7, 3, 2, 9};

        System.out.println("A lista elemei:");
        for(Integer element:num) {
            System.out.print(element.toString()+", ");
        }
        // num = everyThird.changeToZero(num);
        everyThird.changeToZero(num);

        System.out.println("A módosított lista elemei:");
        for(Integer element:num) {
            System.out.print(element.toString()+", ");
        }
    }

    public int[] changeToZero(int[] numbers){
        //numbers[numbers.length-1]= 0;

        for (int i = numbers.length-1 ; i>0; i=i-3){
            numbers[i]=0;
        }
        return numbers;
    }

}
