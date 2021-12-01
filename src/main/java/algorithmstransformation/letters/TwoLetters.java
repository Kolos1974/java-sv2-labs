package algorithmstransformation.letters;

import java.util.ArrayList;
import java.util.List;

public class TwoLetters {
    public List<String> getFirstTwoLetters(List<String> list){
        List<String> result = new ArrayList<>();
        for (String element : list){
            result.add(element.substring(0,2));
        }
        return result;
    }
}
