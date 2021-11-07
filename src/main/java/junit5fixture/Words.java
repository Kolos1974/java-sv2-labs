package junit5fixture;

import java.util.ArrayList;
import java.util.List;

public class Words {
    List<String> words = new ArrayList<>();

    public List<String> getWords() {
        return words;
    }

    public void addWord(String word) {
        words.add(word);
    }

    public void getWordsStartWith(String prefix) {
        List<String> delete = new ArrayList<>();
        for (String element : words) {
            if (!(element.substring(0, prefix.length()).equals(prefix))) {
                delete.add(element);
            }
            /*
                if (element.startsWith(prefix){
                    delete.add(element);
                }
            */
        }
        words.removeAll(delete);
    }

    public void getWordsWithLength(int length){
        List<String> delete = new ArrayList<>();
        for (String element : words){
            if (!(element.length()==length)) {
                delete.add(element);
            }
        }
        words.removeAll(delete);
    }
}

