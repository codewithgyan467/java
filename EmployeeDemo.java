import java.util.Scanner;


class Employee {
    String name;
    double basicSalary;

   
    public Employee(String name, double basicSalary) {
        this.name = name;
        this.basicSalary = basicSalary;
    }

   
    public double calculateGrossSalary() {
        double hra = 0.10 * this.basicSalary;
        double da = 0.12 * this.basicSalary; 
        return this.basicSalary + hra + da;
    }
}
   public class EmployeeDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter employee name: ");
        String name = scanner.nextLine();

        System.out.print("Enter basic salary: ");
        double salary = scanner.nextDouble();

        Employee emp = new Employee(name, salary);
        double grossSalary = emp.calculateGrossSalary();

        System.out.println("\n--- Employee Salary Details ---");
        System.out.println("Name: " + emp.name);
        System.out.printf("Basic Salary: %.2f%n", emp.basicSalary);
        System.out.printf("Gross Salary (including HRA and DA): %.2f%n", grossSalary);

        scanner.close();
    }
}