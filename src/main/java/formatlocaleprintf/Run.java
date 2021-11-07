package formatlocaleprintf;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Run {
    private List<Double> list = new ArrayList<>();
    private String name;

    public Run(String name, List<Double> list) {
        this.name = name;
        this.list = list;
    }

    public void addRun(double km){
        list.add(km);
    }

    public String printFormattedRunText(){
        StringBuilder result = new StringBuilder();
        String date = LocalDate.now().toString();

        result.append("Kedves "+name+"!");
        result.append(" A mai dátum: "+date+".");
        result.append(String.format(" Ezen a héten ez a %d. futásod.", list.size()));
        result.append(String.format("Most %.1f km-t futottál. Csak így tovább!", list.get(list.size()-1)));
        return result.toString();
    }


    public static void main(String[] args) {
        Run run = new Run("Kiss Béla", new ArrayList<Double>(Arrays.asList(12.2, 23.0)));
        run.addRun(17);
        System.out.println(run.printFormattedRunText());

    }
}
