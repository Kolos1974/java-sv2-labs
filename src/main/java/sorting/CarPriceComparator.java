package sorting;

import java.util.Comparator;

public class CarPriceComparator implements Comparator<Car> {


    @Override
    public int compare(Car o1, Car o2) {
        // return Integer.valueOf(one.getPrice()).compareTo(other.getPrice());
        return ((Integer) o1.getPrice()).compareTo((Integer) o2.getPrice());
    }
}
