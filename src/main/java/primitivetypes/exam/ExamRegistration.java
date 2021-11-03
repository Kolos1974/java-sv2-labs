package primitivetypes.exam;

import java.time.LocalDate;
import java.util.Scanner;

public class ExamRegistration {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Kérem a vizsgázó nevét: ");
        String stName = scanner.nextLine();
        System.out.println("Kérem a születési dátumát : ");
        String stBirthDate = scanner.nextLine();
        System.out.println("Adja meg az irányító számát: ");
        String stPostCode = scanner.nextLine();
        System.out.println("Adja meg a jegyei átlagát: ");
        String stAverage = scanner.nextLine();

        Exam exam = new Exam();

        String ev = stBirthDate.substring(0,4);
        String ho = stBirthDate.substring(5,7);
        String nap = stBirthDate.substring(8,10);


        LocalDate realBirthDay = LocalDate.of(Integer.parseInt(ev),
                                              Integer.parseInt(ho),
                                              Integer.parseInt(nap));

        int realPostCode = Integer.parseInt(stPostCode);
        double realAverage = Double.parseDouble(stAverage);

        Person person = new Person(stName, realBirthDay, realPostCode, realAverage);
        exam.addPerson(person);

        System.out.println(person);
        System.out.println(exam.getExaminers());

    }
}
