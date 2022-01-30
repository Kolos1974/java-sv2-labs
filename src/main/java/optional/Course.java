package optional;

public class Course {
    private String name;
    private int price;
    private Level level;

    public Course(String courseName,  Level level, int price) {
        this.name = courseName;
        this.price = price;
        this.level = level;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    public Level getLevel() {
        return level;
    }
}
