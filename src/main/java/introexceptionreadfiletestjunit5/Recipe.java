package introexceptionreadfiletestjunit5;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class Recipe {
    private List<String> ingredients = new ArrayList<>();

    public List<String> getIngredients() {
        return ingredients;
    }

    public void addIngredients(Path path) {
        try {
            List<String> text = readFile(path);
            int lineNum= 0;
            for (String element : text) {
                String[] words = element.split(" ");
                lineNum++;
                if ((lineNum>2) && (!(words[2].isEmpty()))){
                    ingredients.add(words[2]);
                }
            }
        } catch (IllegalArgumentException e) {
            e.printStackTrace();
        }
    }

    private List<String> readFile(Path path){
        List<String> text = new ArrayList<>();
        try {
            text = Files.readAllLines(path);
        } catch (IOException e) {
            throw new IllegalStateException("Can not read file.", e);
        }
        return text;
    }

    public static void main(String[] args) {
        introexceptionreadfiletestjunit4.Recipe recipe = new introexceptionreadfiletestjunit4.Recipe();
        recipe.addIngredients(Path.of("src/test/resources/recipe.txt"));
        for (String element : recipe.getIngredients()){
            System.out.println(element);
        }
    }

}
