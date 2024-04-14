import employees.Employee;
import employees.Manager;
import employees.Worker;

public class Company {
    public static void main(String[] args) {
        Employee[] employees = new Employee[5];
        employees[0] = new Manager("Alicja Kowalska", 4250, 0);
        employees[1] = new Worker("Bartosz Nowak", 8500, "Developer");
        employees[2] = new Employee("Cezary Wiśniewski", 12000);
        employees[3] = new Employee("Dorota Białek", 7500);
        employees[4] = new Worker("Edward Jabłoński", 15000, "Team Lead");

        // Display data for all employees
        System.out.println("Wszyscy pracownicy:");
        for (Employee emp : employees) {
            System.out.println(emp);
        }
    }
}
