package algorithmsmax.hill;

import java.util.List;

public class Hill {

    public int getMax(List<Integer> list) {
        int result = list.get(0);
        for (int element : list) {
            if (element > result) {
                result = element;
            }
        }
        return result;
    }

}
