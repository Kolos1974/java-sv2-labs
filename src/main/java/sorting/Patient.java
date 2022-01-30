package sorting;

import java.time.LocalDateTime;

public class Patient {
    private String name;
    private String TAJ;
    private LocalDateTime startTime;

    public Patient(String name, String TAJ, LocalDateTime startTime) {
        this.name = name;
        this.TAJ = TAJ;
        this.startTime = startTime;
    }

    public String getName() {
        return name;
    }

    public String getTAJ() {
        return TAJ;
    }

    public LocalDateTime getStartTime() {
        return startTime;
    }
}
