package streamsalgorithms;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.OptionalInt;
import java.util.stream.Collectors;

public class Employee {
    private String name;
    private int yearOfBirth;

    public Employee(String name, int yearOfBirth) {
        this.name = name;
        this.yearOfBirth = yearOfBirth;
    }

    public String getName() {
        return name;
    }

    public int getYearOfBirth() {
        return yearOfBirth;
    }

    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee("Béla", 1965));
        employees.add(new Employee("Géza", 1985));
        employees.add(new Employee("Ágota", 1981));
        employees.add(new Employee("Irén", 1968));
        employees.add(new Employee("Tibor", 2001));
        employees.add(new Employee("Zsolt", 1976));

        // Összegezd az alkalmazottak születési évét!
        int result = employees.stream()
                //.mapToInt(employee -> employee.getYearOfBirth())
                .mapToInt(Employee::getYearOfBirth)
                .sum();
        System.out.println(result);

        // Összegezd az alkalmazottak ételkorát!
        int ages = employees.stream()
                .mapToInt(employee -> LocalDate.now().getYear()-employee.getYearOfBirth())
                .sum();
        System.out.println(ages);

        //Hány alkalmazott van a listában?
        long elements = employees.stream()
           //     .filter(employee -> employee.getName().equals(employee.getName()))
                .count();
        System.out.println(elements);

        // Hány alkalmazott született 1990-nél korábban?
        long young = employees.stream()
                .filter(employee -> employee.getYearOfBirth()<1990)
                .count();
        System.out.println(young);

        // A legkorábban született születési évét.
        OptionalInt first = employees.stream()
                .mapToInt(employee -> employee.getYearOfBirth())
                .min();
            //  .orElseThrow(() -> new IllegalArgumentException("Empty"));
        System.out.println(first);

        // A legkorábban született alkalmazott neve
        String name = employees.stream()
                .sorted(new Comparator<Employee>() {
                    @Override
                    public int compare(Employee o1, Employee o2) {
                        return o1.getYearOfBirth()-o2.getYearOfBirth();
                    }
                })
                .map(employee -> employee.getName())
                .findFirst().orElseThrow(()->new IllegalArgumentException("Empty"));

        System.out.println(name);

        // Mindenki 1980 előtt született?
        boolean before = employees.stream()
                .allMatch(employee -> employee.getYearOfBirth()<1980);
        System.out.println(before);

        // 1990-nél korábban születettek:
        System.out.println(
                employees.stream()
                        .filter(employee -> employee.getYearOfBirth()<1990)
                        .collect(Collectors.toList())
        );

        // Transzformáció: az alkalmazottak nevei:
        System.out.println(
                employees.stream()
                        .map(employee -> employee.getName())
                        .collect(Collectors.toList())
        );

        // Kombinálva, 1990-nél korábban született alkalmazottak nevei:
        System.out.println(
                employees.stream()
                        .filter(employee -> employee.getYearOfBirth()<1990)
                        .map(employee -> employee.getName())
                        .collect(Collectors.toList())
        );


    }
}
