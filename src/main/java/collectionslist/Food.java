package collectionslist;

import java.time.LocalDate;

public class Food {
    private String name;
    private LocalDate experiDate;

    public Food(String name, LocalDate experiDate) {
        this.name = name;
        this.experiDate = experiDate;
    }

    public String getName() {
        return name;
    }

    public LocalDate getExpirationDate() {
        return experiDate;
    }
}
