package intromethods.employee;

public class EmployeeMain {
    public static void main(String[] args) {
        Employee employee = new Employee("Kiss Károly", 1976, 423000);
        System.out.println(employee);
        employee.raiseSalary(30000);
        System.out.println(employee);
    }

}
