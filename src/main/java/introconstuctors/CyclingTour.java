package introconstuctors;

import java.time.LocalDate;

public class CyclingTour {
    private String description;
    private LocalDate startTime;
    private int numberOfPeople;
    private double kms;

    public CyclingTour(String description, LocalDate startTime) {
        this.description = description;
        this.startTime = startTime;
    }

    public String getDescription() {
        return description;
    }

    public LocalDate getStartTime() {
        return startTime;
    }

    public int getNumberOfPeople() {
        return numberOfPeople;
    }

    public double getKms() {
        return kms;
    }

    public void registerPerson(int person){
        numberOfPeople +=person;
    }

    public void ride(double km){
        kms += km;
    }

    public static void main(String[] args) {
        CyclingTour cyclingTour = new CyclingTour("Balaton kör", LocalDate.of(2021, 11, 10));
        System.out.println("A túra attribútumai: "+cyclingTour.getDescription()+", "+cyclingTour.getStartTime()+", "+
                cyclingTour.getNumberOfPeople()+", "+cyclingTour.getKms());
        cyclingTour.registerPerson(2);
        cyclingTour.registerPerson(3);
        cyclingTour.ride(83);
        cyclingTour.ride(12);

        System.out.println("A túra attribútumai: "+cyclingTour.getDescription()+", "+cyclingTour.getStartTime()+", "+
                cyclingTour.getNumberOfPeople()+", "+cyclingTour.getKms());
    }

}
