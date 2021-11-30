package algorithmdecision.towns;

import java.util.List;

public class Town {
    public boolean containsFewerHabitants(List<Integer> list, int limit){
        for (int i : list){
            if (i< limit){
                return true;
            }
        }
        return false;
    }
}
