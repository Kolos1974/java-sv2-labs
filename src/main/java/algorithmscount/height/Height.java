package algorithmscount.height;

import java.util.List;

public class Height {

    public int countChildrenWithHeightGratherThan(List<Integer> childrenHeight, int limit){
        int result = 0;
        for (Integer element : childrenHeight){
            if (element>limit) {
                result++;
            }
        }
        return result;
    }
}
