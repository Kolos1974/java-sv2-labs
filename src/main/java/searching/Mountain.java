package searching;

import java.util.Arrays;

public class Mountain {
    int[] tomb = new int [] {152,1652};

    public Mountain(int[] tomb) {
        this.tomb = tomb;
    }

    public boolean searchPeak(Peak peak){
        return (Arrays.binarySearch(tomb, peak.getHeight())>=0);

    }

}
