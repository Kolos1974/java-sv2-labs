package algorithmsmax.temperature;

import java.util.List;

public class Temperature {

    public int getMin(List<Integer> list){
        int min = list.get(0);
        for (int element : list){
            if (element<min) {
                min = element;
            }
        }
        return min;
    }

}
