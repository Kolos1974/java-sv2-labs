package introdate;

import java.time.LocalDate;
import java.util.Scanner;

public class EmployeeTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please write your name:");
        String name = scanner.nextLine();

        System.out.println("Please write your birth year:");
        int year = scanner.nextInt();
        System.out.println("Please write your birth month:");
        int month = scanner.nextInt();
        System.out.println("Please write your birth day:");
        int day = scanner.nextInt();

        Employee employee = new Employee(name, year, month, day);

        System.out.println("The employee datas:");
        System.out.println(employee.getName());
        System.out.println(employee.getDateOfBirth());
        System.out.println(employee.getBeginEmployment());
    }

}
