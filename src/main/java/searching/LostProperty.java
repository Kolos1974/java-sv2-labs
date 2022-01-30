package searching;

import java.time.LocalDate;

public class LostProperty implements Comparable<LostProperty>{
    private String regNumber;
    private String description;
    private LocalDate foundDate;

    public LostProperty(String id, String description, LocalDate foundDate) {
        this.regNumber = id;
        this.description = description;
        this.foundDate = foundDate;
    }

    public LostProperty(String description, LocalDate foundDate) {
        this.description = description;
        this.foundDate = foundDate;
    }

    public String getRegNumber() {
        return regNumber;
    }

    public String getDescription() {
        return description;
    }

    public LocalDate getFoundDate() {
        return foundDate;
    }


    @Override
    public int compareTo(LostProperty o) {
        if (description.compareTo(o.getDescription())!=0){
            return description.compareTo(o.getDescription());
        } else {
            return foundDate.compareTo(o.getFoundDate());
        }

    }
}
