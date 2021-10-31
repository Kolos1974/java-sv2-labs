package arraylist;

import java.util.ArrayList;
import java.util.List;

public class Second {
    public static void main(String[] args) {
        List<Integer> nums = new ArrayList<>();
        nums.add(3);
        nums.add(9);
        nums.add(42);
        nums.add(67);
        nums.add(4);
        nums.add(0);
        nums.add(76);
        nums.add(14);
        nums.add(84);
        nums.add(35);
        nums.add(92);
        System.out.println("The list's element: "+nums.toString());
        System.out.println();
        System.out.println("The list every second element:");
        for (int i = 0; i<nums.size(); i++){
            if (i%2 ==1){
                System.out.print(nums.get(i)+", ");
            }
        }
    }
}
