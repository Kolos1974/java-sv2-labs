package introexceptiontrycatch;

import java.util.Arrays;
import java.util.List;

public class FirstLetter {

    public static void main(String[] args) {
        List<String> strings = Arrays.asList("alfa", "béta", "gamma", null, "delta");

        try {
            for (String element : strings) {
                System.out.println(element.substring(0,1));
            }
       // } catch (Exception e){
        } catch (NullPointerException  e){
            System.out.println("Hiba keletkezett!!");
            System.out.println(e.getMessage());
            System.out.println(e.getStackTrace());
        }

    }
}
