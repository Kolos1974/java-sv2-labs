package collectionsautoboxing;

import java.util.HashMap;
import java.util.Map;

public class Paper {
    private Map<String, Integer> paperCollect = new HashMap<>();

    public Map<String, Integer> getPaperCollect() {
        return paperCollect;
    }

    public static void main(String[] args) {
        Paper paper = new Paper();
        paper.putFurtherPaper("1.a", 235);
        paper.putFurtherPaper("5.b", 421);
        paper.putFurtherPaper("8.a", 398);
        paper.putFurtherPaper("1.a", 100);
        paper.putFurtherPaper("5.b", 200);
        paper.putFurtherPaper("8.a", 300);
        System.out.println(paper.getPaperCollect());
        System.out.println(paper.getWinnerClass());
        System.out.println(paper.getTotalWeight());
    }


    public void putFurtherPaper(String className, int kilogramms){
        if (!(paperCollect.containsKey(className))){
            paperCollect.put(className, 0);
        }
        paperCollect.put(className, paperCollect.get(className)+kilogramms);
    }

    public String getWinnerClass(){
        int firstkilo = Integer.MIN_VALUE;
        String winner ="";
        for (Map.Entry<String, Integer> element : paperCollect.entrySet()){
            if (element.getValue()>firstkilo) {
                firstkilo = element.getValue();
                winner = element.getKey();
            }
        }
        return winner;
    }

    public int getTotalWeight(){
        int total = 0;
        for (Integer element : paperCollect.values()){
            total += element;
        }
        return total;
    }
}
