package projects.catalog;

import java.util.List;

public class Validators {

    public static final boolean isBlank(String text){
        if (text== null || text.isBlank()){
            return true;
        }
        return false;
    }

    /*
    public static final boolean isEmpty(String text){
        if (text == null || text.isEmpty()){
            return true;
        }
        return false;
    }
    */

    /*
    public static final boolean isBlank(List list){
        if (list== null){
            return true;
        }
        return false;
    }
    */

    public static final boolean isEmpty(List list){
        if (list == null || list.isEmpty()){
            return true;
        }
        return false;
    }
}
