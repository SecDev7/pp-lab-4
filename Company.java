import employees.Employee;
import employees.Manager;
import employees.Worker;

public class Company {
    public static void main(String[] args) {
         
        Employee[] employees = new Employee[7];
        employees[0] = new Manager("Alicja Kowalska", 4250, 0);
        employees[1] = new Worker("Bartosz Nowak", 8500, "Developer");
        employees[2] = new Employee("Cezary Wiśniewski", 12000);
        employees[3] = new Employee("Dorota Białek", 7500);
        employees[4] = new Worker("Edward Jabłoński", 15000, "Team Lead");
        employees[5] = new Manager("Filip Mazur", 6500, 2);  
        employees[6] = new Worker("Grażyna Brońska", 4800, "HR Specialist");  

         
        for (Employee emp : employees) {
            emp.setSalary(emp.getSalary() + 500);
        }

         
        ((Manager) employees[0]).setNumberOfSubordinates(5);
        ((Manager) employees[0]).setSalary(7500);
        ((Manager) employees[5]).setNumberOfSubordinates(3);
        ((Manager) employees[5]).setSalary(7500);

       
        System.out.println("Zaktualizowane informacje o pracownikach:");
        for (Employee emp : employees) {
            System.out.println(emp);
        }
    }
}
