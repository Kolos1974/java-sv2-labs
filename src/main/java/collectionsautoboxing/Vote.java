package collectionsautoboxing;

import java.util.HashMap;
import java.util.Map;

public class Vote {

    public Map<VoteResult, Integer> getResult(Map<String, VoteResult> map){
        Map<VoteResult, Integer> result = new HashMap<>();
        for (VoteResult element : map.values()){
            if (!(result.get(element)==null)) {
                result.put(element, result.get(element).intValue() + 1);
            }else {
                result.put(element, 1);
            }
        }
        return result;
    }


    public static void main(String[] args) {
        Vote vote = new Vote();
        Map<String, VoteResult> votes = new HashMap<>();
        votes.put("Béla", VoteResult.NO);
        votes.put("Géza", VoteResult.YES);
        votes.put("Ádám", VoteResult.YES);
        votes.put("Anna", VoteResult.NO);
        votes.put("László", VoteResult.ABSTAIN);
        votes.put("Imre", VoteResult.YES);
        votes.put("István", VoteResult.YES);
        votes.put("Mária", VoteResult.NO);
        System.out.println(votes);
        System.out.println(vote.getResult(votes));

    }
}
