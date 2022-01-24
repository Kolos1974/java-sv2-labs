package collectionslist;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.LinkedList;

public class FoodStore {
    private LinkedList<Food> foods = new LinkedList<>();

    public LinkedList<Food> getFoods() {
        return foods;
    }

    public void addFood(Food f){
        foods.add(f);
    }

    public void sellFirst(Food food){
        if (food.getExpirationDate().isEqual(LocalDate.now())){
            foods.addFirst(food);
        } else {
            foods.add(food);
        }
    }
}
