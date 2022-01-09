package projects.schoolrecords;

import java.util.*;

public class SchoolRecordsController {
    private ClassRecords classRecords = new ClassRecords("A osztály", new Random());
    private List<Subject> subjects = new ArrayList<>();
    private List<Tutor> tutors = new ArrayList<>();


    public static void main(String[] args) {
        SchoolRecordsController schoolRecordsController = new SchoolRecordsController();
        schoolRecordsController.initSchool();
        schoolRecordsController.runMenu();
    }

    public void initSchool(){
        subjects.add(new Subject("matek"));
        subjects.add(new Subject("földrajz"));
        subjects.add(new Subject("angol"));
        subjects.add(new Subject("kémia"));
        subjects.add(new Subject("nyelvtan"));
        subjects.add(new Subject("orosz"));
        subjects.add(new Subject("történelem"));

        tutors.add(new Tutor("Farkas Andrea", Arrays.asList(subjects.get(1), subjects.get(3), subjects.get(4))));
        tutors.add(new Tutor("Makata Mária", Arrays.asList(subjects.get(0))));
        tutors.add(new Tutor("Kiss Katalin", Arrays.asList(subjects.get(5), subjects.get(6))));
    }

    public void runMenu(){

        int choosenMenu;

        do {
            printMenu();
            choosenMenu = Integer.parseInt(new Scanner(System.in).nextLine());

            switch (choosenMenu) {
                case 1:
                    //readOffice();
                    break;

            }

        } while (choosenMenu != 11);

    }

    public void printMenu() {
        System.out.println("1.  Diákok nevének listázása");
        System.out.println("2.  Diák név alapján keresése");
        System.out.println("3.  Diák létrehozása");
        System.out.println("4.  Diák név alapján törlése");
        System.out.println("5.  Diák feleltetése");
        System.out.println("6.  Osztályátlag kiszámolása");
        System.out.println("7.  Tantárgyi átlag kiszámolása");
        System.out.println("8.  Diákok átlagának megjelenítése");
        System.out.println("9.  Diák átlagának kiírása");
        System.out.println("10. Diák tantárgyhoz tartozó átlagának kiírása");
        System.out.println("11. Kilépés");
    }

}
