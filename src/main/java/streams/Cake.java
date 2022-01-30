package streams;

import java.util.List;

public class Cake {
    private String name;
    private List<String> ingredients;

    public Cake(String name, List<String> details) {
        this.name = name;
        this.ingredients = details;
    }

    public String getName() {
        return name;
    }

    public List<String> getIngredients() {
        return ingredients;
    }
}
