public class Company {
    public static void main(String[] args) {
        Employee[] employees = new Employee[5];
        employees[0] = new Employee("Alicja Kowalska", 4250);
        employees[1] = new Employee("Bartosz Nowak", 8500);
        employees[2] = new Employee("Cezary Wiśniewski", 12000);
        employees[3] = new Employee("Dorota Białek", 7500);
        employees[4] = new Employee("Edward Jabłoński", 15000);

        System.out.println("Przed aktualizacją wynagrodzenia: " + employees[3]);

        employees[3].setSalary(8000);

        System.out.println("Po aktualizacji wynagrodzenia: " + employees[3]);

        System.out.println("Wszyscy pracownicy:");
        for (Employee emp : employees) {
            System.out.println(emp);
        }
    }
}
