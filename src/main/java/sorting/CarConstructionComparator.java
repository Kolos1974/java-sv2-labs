package sorting;

import java.util.Comparator;

public class CarConstructionComparator implements Comparator<Car> {

    @Override
    public int compare(Car o1, Car o2) {
        // return Integer.valueOf(one.getYearOfConstruction()).compareTo(other.getYearOfConstruction());
        return ((Integer) o1.getMadeYear()).compareTo((Integer) o2.getMadeYear());
    }
}
