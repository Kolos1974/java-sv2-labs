package sorting;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CarDealer {
    private List<Car> sellCars = new ArrayList<>();


    public void addCar(Car car){
        sellCars.add(car);
    }

    public List<Car> getSellCars() {
        return sellCars;
    }

    public List<Car> getCarsOrderedByYearOfConstruction(){
        List<Car> result = new ArrayList<>(sellCars);
        Collections.sort(result, new CarConstructionComparator());
        return result;
    }

    public List<Car> getCarsOrderedByPrice(){
        List<Car> result = new ArrayList<>(sellCars);
        Collections.sort(result, new CarPriceComparator());
        return result;
    }
}
