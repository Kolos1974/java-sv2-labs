package interfaces.simpletasks;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SimpleTasks implements Runnable{
    private List<String> tasks;

    public SimpleTasks(List<String> tasks) {
        this.tasks = tasks;
    }

    @Override
    public void run() {
        do {
            System.out.println("run...");
        } while (nextStep());


    }

    public List<String> getTasks() {
        return tasks;
    }

    private boolean nextStep(){
        if (getTasks().size()>0) {
            tasks.remove(getTasks().size() - 1);
        }
        return (getTasks().size()>0);
    }


    public static void main(String[] args) {
        //List<String> tasks = Arrays.asList("bevásárlás", "tanulás", "vacsorázás","rendrakás");
        List<String > tasks = new ArrayList<>(Arrays.asList("bevásárlás", "tanulás", "vacsorázás","rendrakás"));

        SimpleTasks simpleTasks = new SimpleTasks(tasks);
        simpleTasks.run();


    }
}
