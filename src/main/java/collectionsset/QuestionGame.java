package collectionsset;

import java.util.*;

public class QuestionGame {
    private List<RightAnswer> rightAnswers = new ArrayList<>();

    public QuestionGame(List<RightAnswer> rightAnswers) {
        this.rightAnswers = rightAnswers;
    }

    public Set<String> drawWinners(){
        HashSet<String> result = new HashSet<>();
        Random random = new Random();
        int winnerNumber = 0;
        int winner = 0;
        String winnerName= "";
        //while ((winnerNumber<5) && (rightAnswers.size()>0)){
        while ((result.size()<5) && (rightAnswers.size()>0)){
            winner = random.nextInt(rightAnswers.size());
            winnerName = rightAnswers.get(winner).getName();
            winnerNumber++;
            result.add(winnerName);
            rightAnswers.remove(winner);
        }

        //if (winnerNumber<5){
        if (result.size()<5){
            throw new IllegalArgumentException("Not enough right answers!");
        }
        return result;
    }
}
