package algorithmdecision.words;

import java.util.List;

public class Word {
    public boolean containsLongerWord(List<String> wordList, String element){
        for (String word : wordList){
            if (word.length()>element.length()){
                return true;
            }
        }
        return false;
    }

    public boolean containsLongerWordOther(List<String> wordList, String element){
        boolean result = false;
        for (String word : wordList){
            if (word.length()>element.length()){
                result = true;
                break;
            }
        }
        return result;
    }

    public boolean containsLongerWordWithWhile(List<String> wordList, String element){
        boolean result = false;
        int i = 0;
        while (i<wordList.size() && !result){
            if (wordList.get(i).length()>element.length()){
                result = true;
            }
            i++;
        }
        return result;
    }




}
