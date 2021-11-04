package enumtype.position;

public enum Position {
    BOSS(20000000, "car, creditcard"), WORKER(200000, "food"), SECRETARY(150000,"clothes"), TECHNICAL(450000, "laptop");

    private int salary;
    private String benefit;

    Position(int salary, String benefit) {
        this.salary = salary;
        this.benefit = benefit;
    }

    public int getSalary() {
        return salary;
    }

    public String getBenefit() {
        return benefit;
    }
}
