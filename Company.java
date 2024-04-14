import employees.Employee;
import employees.Manager;
import employees.Worker;

public class Company {
    public static void main(String[] args) {
        Employee[] employees = new Employee[5];
        employees[0] = new Manager("Alicja Kowalska", 4250, 0);  // Manager
        employees[1] = new Worker("Bartosz Nowak", 8500, "Developer");  // Worker
        employees[2] = new Employee("Cezary Wiśniewski", 12000);  // Employee
        employees[3] = new Employee("Dorota Białek", 7500);  // Employee
        employees[4] = new Worker("Edward Jabłoński", 15000, "Team Lead");  // Worker

        
        int nonManagerCount = 0;
        for (Employee emp : employees) {
            if (!(emp instanceof Manager)) {
                nonManagerCount++;
            }
        }

         
        ((Manager) employees[0]).setNumberOfSubordinates(nonManagerCount);

         
        employees[0].setSalary(7500);

        
        System.out.println("Wszyscy pracownicy:");
        for (Employee emp : employees) {
            System.out.println(emp);
        }
    }
}
