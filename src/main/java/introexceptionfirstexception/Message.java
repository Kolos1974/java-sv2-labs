package introexceptionfirstexception;

import java.util.Arrays;
import java.util.List;

public class Message {
    public static void main(String[] args) {
        List<String> codedMessage = Arrays.asList("76", "101", "103", "121", "101", "110", "32",
                "115", "122", "233", "112", "32", "110", "97", "112", "111", "100", "33");

        StringBuilder sb = new StringBuilder();
        for (String element : codedMessage){
            char c = (char) Integer.parseInt(element);
            sb.append(c);
        }
        System.out.println(sb);


        List<String> anotherCodedMessage = Arrays.asList("69", "122", "32", "101", "103", "121", "32", "104", "105",
                "98", "225", "115", "32", "252", "122", "1O1", "110", "101", "116", "46");


        StringBuilder sb2 = new StringBuilder();
        for (String element : anotherCodedMessage){
            char c = (char) Integer.parseInt(element);
            sb2.append(c);
        }
        System.out.println(sb2);

        // A kivétel az egyik 1O1-es számnál keletkezik, mert a 0 helyett nagy O betű szerepel, ami nem alakítható számmá.
    }


}
