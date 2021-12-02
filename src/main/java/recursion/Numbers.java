package recursion;

import java.util.Arrays;

public class Numbers {
    public int getSum(int[] numbers){
        if (numbers.length>1){
            int[] result = Arrays.copyOfRange(numbers, 1, numbers.length);
            return numbers[0]+getSum(result);
        } else if (numbers.length==1){
            return numbers[0];
        } else {
            return 0;
        }
    }

}
