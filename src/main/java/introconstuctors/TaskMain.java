package introconstuctors;

public class TaskMain {
    public static void main(String[] args) {
        Task task = new Task("Tanulás", "Java alapok");

        task.start();
        task.setDuration(6);
        System.out.println("A task: "+task.getTitle()+", "+task.getDescription()+", "+
                task.getStartDateTime()+", "+task.getDuration());
    }
}
