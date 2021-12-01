package algorithmsfilter.prefix;

import java.util.ArrayList;
import java.util.List;

public class Prefix {

    public List<String> getWordsStartWith(List<String> words, String prefix){
        List<String> result = new ArrayList<>();
        for (String element : words){
            if (element.startsWith(prefix)){
                result.add(element);
            }
        }
        return result;
    }

}
