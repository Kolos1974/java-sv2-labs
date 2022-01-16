package objectclass.ancestor;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CommonAncestor {
    List<Object> objects = new ArrayList<>();

    public static void main(String[] args) {
        CommonAncestor commonAncestor = new CommonAncestor();

        Fruit fruit = new Fruit();
        commonAncestor.objects.add(fruit);

        Apple apple = new Apple();
        commonAncestor.objects.add(apple);

        Starking starking = new Starking();
        commonAncestor.objects.add(starking);

        Vegetable vegetable = new Vegetable();
        commonAncestor.objects.add(vegetable);

        commonAncestor.objects.add("alma");

        commonAncestor.objects.add(12);

        commonAncestor.objects.add('x');

        LocalDate localDate = LocalDate.now();
        commonAncestor.objects.add(localDate);

        List<Integer> array = Arrays.asList(1,2,3,4,5,6);
        commonAncestor.objects.add(array);

        List<String> text = Arrays.asList("Egy", "Két", "Há", "Négy");
        commonAncestor.objects.add(text);

        for (Object element : commonAncestor.objects){
            System.out.println(element);
        }

    }
}
