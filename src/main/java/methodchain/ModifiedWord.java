package methodchain;

import java.util.Locale;

public class ModifiedWord {
    public String modify(String word){
        return word.substring(0,1).toUpperCase()+"x"+word.substring(2,3).toUpperCase()+"y";
    }
}
