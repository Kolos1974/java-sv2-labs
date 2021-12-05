package methodstructure.pendrives;

import java.util.List;

public class Pendrives {
    public Pendrive getBest(List<Pendrive> list){
        Pendrive result = list.get(0);
        for (Pendrive element : list){
            if (result.comparePricePerCapacity(element)==1){
                result = element;
            }
        }
        return result;
    }

    public Pendrive getCheapest(List<Pendrive> list){
        Pendrive result = list.get(0);
        for (Pendrive element : list){
            if (!(result.isCheaperThan(element))){
                result = element;
            }
        }
        return result;
    }

    public void risePriceWhereCapacity(List<Pendrive> list, int percent, int capacity){
        for (Pendrive element : list){
            if (element.getCapacity()==capacity){
                element.risePrice(percent);
            }
        }

    }

}

