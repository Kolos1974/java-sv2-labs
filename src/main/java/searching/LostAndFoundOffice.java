package searching;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class LostAndFoundOffice {
    private List<LostProperty> losted = new LinkedList<>();


    public List<LostProperty> getLosted() {
        return losted;
    }



    public LostProperty findLostProperty(LostProperty searched){

        int result = Collections.binarySearch(losted, searched);
        if (result<0){
            throw new IllegalArgumentException("Property not found.");
        }
        return losted.get(result);

    }

    public void addProperty(LostProperty property) {
        losted.add(property);
    }


}
